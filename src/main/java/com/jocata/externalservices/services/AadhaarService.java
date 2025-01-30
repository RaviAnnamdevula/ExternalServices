package com.jocata.externalservices.services;

import com.jocata.externalservices.form.AadhaarRequestForm;
import com.jocata.externalservices.form.AadhaarResponseForm;

public interface AadhaarService {
    AadhaarResponseForm getAadhaarInfo(AadhaarRequestForm aadhaarRequestForm);
}
