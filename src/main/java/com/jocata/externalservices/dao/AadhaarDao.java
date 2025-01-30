package com.jocata.externalservices.dao;

import com.jocata.externalservices.entities.AadhaarDetails;

public interface AadhaarDao {
    AadhaarDetails getAadharInfo(String uidNumber);
}
