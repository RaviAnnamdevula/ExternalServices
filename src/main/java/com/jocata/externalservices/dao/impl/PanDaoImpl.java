package com.jocata.externalservices.dao.impl;

import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.entities.PanDetails;
import com.jocata.externalservices.repo.PanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanDaoImpl implements PanDao {

    @Autowired
    private PanRepository panRepository;

    @Override
    public PanDetails getPanInfo(String panNo) {
        return panRepository.findByPanNo(panNo);
    }
}
