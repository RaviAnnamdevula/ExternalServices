package com.jocata.externalservices.controller;

import com.jocata.externalservices.form.AadhaarRequestForm;
import com.jocata.externalservices.form.AadhaarResponseForm;
import com.jocata.externalservices.services.AadhaarService;
import com.jocata.externalservices.services.impl.AadhaarServiceImpl;

public class AadhaarController {

    AadhaarService aadhaarService = new AadhaarServiceImpl();
// hi added new line in DbConnection branch
    public AadhaarResponseForm getAadhaarInfo(AadhaarRequestForm aadhaarRequestForm) {
        return aadhaarService.getAadhaarInfo(aadhaarRequestForm);
    }
}
