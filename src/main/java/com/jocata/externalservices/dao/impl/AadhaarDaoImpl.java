package com.jocata.externalservices.dao.impl;

import com.jocata.externalservices.dao.AadhaarDao;
import com.jocata.externalservices.entities.AadhaarDetails;
import com.jocata.externalservices.repo.AadhaarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AadhaarDaoImpl implements AadhaarDao {

    @Autowired
    private AadhaarRepository aadhaarRepository;

    @Override
    public AadhaarDetails getAadharInfo(String uidNumber) {
        // we should get the details of uiNumber from the dataBase
        // and we should set all those details into the AadhaarDetails obj here
       // AadhaarDetails aadhaarDetails = new AadhaarDetails();
        return aadhaarRepository.findByUidNumber(uidNumber);
    }
}
