package com.jocata.externalservices.services.impl;

import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.dao.impl.PanDaoImpl;
import com.jocata.externalservices.entities.PanDetails;
import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;
import com.jocata.externalservices.services.PanServices;

public class PanServicesImpl implements PanServices {
    PanDao panDao = new PanDaoImpl();
    @Override
    public PanResponseForm getPanInfo(PanRequestForm panRequestForm) {
        PanDetails panDetails = panDao.getPanInfo(panRequestForm.getPanNo());
        PanResponseForm panResponseForm = new PanResponseForm();
        panResponseForm.setPanNo(panDetails.getPanNo());
        panResponseForm.setPanStatus(panDetails.getPanStatus());
        panResponseForm.setName(panDetails.getName());
        panResponseForm.setDob(panDetails.getDob());
        return panResponseForm;
    }
}
