package com.jocata.externalservices.controller.impl;

import com.jocata.externalservices.controller.PanController;
import com.jocata.externalservices.services.PanServices;
import com.jocata.externalservices.services.impl.PanServicesImpl;

public class PanControllerImpl implements PanController {
    PanServices panServices = new PanServicesImpl();
    @Override
    public String getPanInfo() {
        return panServices.getPanInfo();
    }

}
