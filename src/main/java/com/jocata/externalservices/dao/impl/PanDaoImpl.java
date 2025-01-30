package com.jocata.externalservices.dao.impl;

import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.entities.PanDetails;

public class PanDaoImpl implements PanDao {
    @Override
    public PanDetails getPanInfo(String panNo) {
        return new PanDetails();
    }
}
