package com.jocata.externalservices.dao.impl;

import com.jocata.externalservices.dao.AadhaarDao;
import com.jocata.externalservices.entities.AadhaarDetails;

public class AadhaarDaoImpl implements AadhaarDao {
    @Override
    public AadhaarDetails getAadharInfo(String uidNumber) {
        return new AadhaarDetails();
    }
}
