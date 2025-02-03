package com.jocata.externalservices.services.impl;

import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.dao.impl.PanDaoImpl;
import com.jocata.externalservices.entities.PanDetails;
import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;
import com.jocata.externalservices.services.PanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanServicesImpl implements PanServices {

    @Autowired
    PanDao panDao = new PanDaoImpl();

    @Override
    public PanResponseForm getPanInfo(PanRequestForm panRequestForm) {

        PanDetails panDetails = panDao.getPanInfo(panRequestForm.getPanNo());

        PanResponseForm panResponseForm = new PanResponseForm();
        panResponseForm.setPanNo(panDetails.getPanNo());
        panResponseForm.setPanStatus(panDetails.getPanStatus());
        panResponseForm.setName(panDetails.getPanName());
        panResponseForm.setDob(panDetails.getPanDob());
        return panResponseForm;
    }
}
