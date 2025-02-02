package com.jocata.externalservices.services.impl;

import com.jocata.externalservices.dao.AadhaarDao;
import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.dao.impl.AadhaarDaoImpl;
import com.jocata.externalservices.dao.impl.PanDaoImpl;
import com.jocata.externalservices.entities.AadhaarDetails;
import com.jocata.externalservices.form.*;
import com.jocata.externalservices.services.AadhaarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AadhaarServiceImpl implements AadhaarService {

    @Autowired
    AadhaarDao aadhaarDao ;
    private static final Logger logger = LoggerFactory.getLogger(AadhaarServiceImpl.class);
    @Override
    public AadhaarResponseForm getAadhaarInfo(AadhaarRequestForm aadhaarRequestForm) {

        logger.info("Fetching Aadhaar details for UID: {}", aadhaarRequestForm.getUidNumber() );
        logger.info("Task thread name{}", Thread.currentThread().getName());

        AadhaarDetails aadhaarDetails = aadhaarDao.getAadharInfo(aadhaarRequestForm.getUidNumber());

        if (aadhaarDetails == null) {
            logger.warn("No Aadhaar details found for UID: {}", aadhaarRequestForm.getUidNumber());
            return null;
        }

        logger.info("Aadhaar details found: {}", aadhaarDetails);
        AadhaarResponseForm aadhaarResponseForm = new AadhaarResponseForm();

        //Uid
        Uid uid = new Uid();
        uid.setUidNumber(aadhaarDetails.getUidNumber());
        aadhaarResponseForm.setUidNumber(uid);

        //Demographic
        Demographic demographic = new Demographic();
        demographic.setDob(aadhaarDetails.getDob());
        demographic.setGender(aadhaarDetails.getGender());
        demographic.setName(aadhaarDetails.getName());
            //--- demographic address adding
        Address address = new Address();
        address.setAddressLine1(aadhaarDetails.getAddressLine1());
        address.setAddressLine2(aadhaarDetails.getAddressLine2());
        address.setDistrict(aadhaarDetails.getDistrict());
        address.setState(aadhaarDetails.getState());
        address.setPinCode(aadhaarDetails.getPinCode());
        demographic.setAddress(address);

        aadhaarResponseForm.setDemographic(demographic);

        //photo
        Photo photo = new Photo();
        photo.setImageData(aadhaarDetails.getImageData());
        aadhaarResponseForm.setPhoto(photo);

        //mobile
        Mobile mobile = new Mobile();
        mobile.setMobileNo(aadhaarDetails.getMobile());
        mobile.setHashedMobile(aadhaarDetails.getHashedMobile());
        mobile.setMaskedMobile(aadhaarDetails.getMaskedMobile());

        aadhaarResponseForm.setMobileNo(mobile);

        //email
        Email email = new Email();
        email.setEmail(aadhaarDetails.getEmail());
        email.setHashedEmail(aadhaarDetails.getHashedEmail());
        email.setMaskedEmail(aadhaarDetails.getMaskedEmail());
        aadhaarResponseForm.setEmail(email);


        return aadhaarResponseForm;
    }
}
