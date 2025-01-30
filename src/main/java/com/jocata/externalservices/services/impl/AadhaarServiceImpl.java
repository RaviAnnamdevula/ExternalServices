package com.jocata.externalservices.services.impl;

import com.jocata.externalservices.dao.AadhaarDao;
import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.dao.impl.AadhaarDaoImpl;
import com.jocata.externalservices.dao.impl.PanDaoImpl;
import com.jocata.externalservices.entities.AadhaarDetails;
import com.jocata.externalservices.form.*;
import com.jocata.externalservices.services.AadhaarService;

public class AadhaarServiceImpl implements AadhaarService {
    AadhaarDao aadhaarDao = new AadhaarDaoImpl();
    @Override
    public AadhaarResponseForm getAadhaarInfo(AadhaarRequestForm aadhaarRequestForm) {
        AadhaarDetails aadhaarDetails = aadhaarDao.getAadharInfo(aadhaarRequestForm.getUidNumber());

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

        return aadhaarResponseForm;
    }
}
