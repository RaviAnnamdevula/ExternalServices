package com.jocata.externalservices.dao;

import com.jocata.externalservices.entities.PanDetails;

public interface PanDao {
    PanDetails getPanInfo(String panNo);
}
