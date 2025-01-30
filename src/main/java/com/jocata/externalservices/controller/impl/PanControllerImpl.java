package com.jocata.externalservices.controller.impl;

import com.jocata.externalservices.controller.PanController;
import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;
import com.jocata.externalservices.services.PanServices;
import com.jocata.externalservices.services.impl.PanServicesImpl;

public class PanControllerImpl implements PanController {
    PanServices panServices = new PanServicesImpl();
    @Override
    public PanResponseForm getPanInfo(PanRequestForm panRequestForm) {
        return panServices.getPanInfo(panRequestForm);
    }

}
