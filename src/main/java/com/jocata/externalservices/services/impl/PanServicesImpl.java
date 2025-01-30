package com.jocata.externalservices.services.impl;

import com.jocata.externalservices.controller.PanController;
import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.dao.impl.PanDaoImpl;
import com.jocata.externalservices.services.PanServices;

public class PanServicesImpl implements PanServices {
    PanDao panDao = new PanDaoImpl();
    @Override
    public String getPanInfo() {
        return panDao.getPanInfo();
    }
}
