package com.jocata.externalservices.services;

import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;

public interface PanServices {
    PanResponseForm getPanInfo(PanRequestForm panRequestForm);
}
