package com.jocata.externalservices.dao;

import com.jocata.externalservices.entities.PanEntity;
import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;

public interface PanDao {
    PanResponseForm getPanInfo(PanEntity panEntity);
}
