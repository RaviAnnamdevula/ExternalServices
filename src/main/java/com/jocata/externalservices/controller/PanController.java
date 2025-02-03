package com.jocata.externalservices.controller;

import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;
import com.jocata.externalservices.services.PanServices;
import com.jocata.externalservices.services.impl.PanServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pan")
public class PanController {

    @Autowired
    PanServices panServices = new PanServicesImpl();

/*    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "Hello";
    }*/

    @GetMapping
    public PanResponseForm getPanInfo(@RequestParam("no") String no) {
        PanRequestForm panRequestForm = new PanRequestForm();
        panRequestForm.setPanNo(no);
        return panServices.getPanInfo(panRequestForm);
    }
}

