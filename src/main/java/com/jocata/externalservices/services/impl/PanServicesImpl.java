package com.jocata.externalservices.services.impl;

import com.jocata.externalservices.controller.PanController;
import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.dao.impl.PanDaoImpl;
import com.jocata.externalservices.entities.PanEntity;
import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;
import com.jocata.externalservices.services.PanServices;

public class PanServicesImpl implements PanServices {
    PanDao panDao = new PanDaoImpl();
    @Override
    public PanResponseForm getPanInfo(PanRequestForm panRequestForm) {
        PanEntity  panEntity =  new PanEntity();
        return panDao.getPanInfo(panEntity);
    }
}
