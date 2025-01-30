package com.jocata.externalservices.controller.impl;

import com.jocata.externalservices.controller.AadhaarController;
import com.jocata.externalservices.form.AadhaarRequestForm;
import com.jocata.externalservices.form.AadhaarResponseForm;
import com.jocata.externalservices.services.AadhaarService;
import com.jocata.externalservices.services.impl.AadhaarServiceImpl;

public class AadhaarControllerImpl implements AadhaarController {

    AadhaarService aadhaarService = new AadhaarServiceImpl();

    @Override
    public AadhaarResponseForm getAadhaarInfo(AadhaarRequestForm aadhaarRequestForm) {
        return aadhaarService.getAadhaarInfo(aadhaarRequestForm);
    }
}
