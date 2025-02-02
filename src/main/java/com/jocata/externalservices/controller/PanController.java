package com.jocata.externalservices.controller;

import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;
import com.jocata.externalservices.services.PanServices;
import com.jocata.externalservices.services.impl.PanServicesImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PanController {

    PanServices panServices = new PanServicesImpl();

    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "Hello";
    }

    public PanResponseForm getPanInfo(PanRequestForm panRequestForm) {

        return panServices.getPanInfo(panRequestForm);
    }
}

