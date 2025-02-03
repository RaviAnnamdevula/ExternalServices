package com.jocata.externalservices.controller;

import com.jocata.externalservices.form.AadhaarRequestForm;
import com.jocata.externalservices.form.AadhaarResponseForm;
import com.jocata.externalservices.services.AadhaarService;
import com.jocata.externalservices.services.impl.AadhaarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aadhaar")
public class AadhaarController {

    @Autowired
    AadhaarService aadhaarService; /* = new AadhaarServiceImpl();*/

    @GetMapping
    public AadhaarResponseForm getAadhaarInfo(@RequestParam("uid") String uid) {
        AadhaarRequestForm aadhaarRequestForm = new AadhaarRequestForm();
        aadhaarRequestForm.setUidNumber(uid);
        return aadhaarService.getAadhaarInfo(aadhaarRequestForm);
    }
}
