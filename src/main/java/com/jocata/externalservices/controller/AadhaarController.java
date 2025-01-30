package com.jocata.externalservices.controller;

import com.jocata.externalservices.form.AadhaarRequestForm;
import com.jocata.externalservices.form.AadhaarResponseForm;

public interface AadhaarController {
    AadhaarResponseForm getAadhaarInfo(AadhaarRequestForm aadhaarRequestForm);
}
