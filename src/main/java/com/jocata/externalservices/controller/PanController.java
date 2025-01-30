package com.jocata.externalservices.controller;

import com.jocata.externalservices.form.PanRequestForm;
import com.jocata.externalservices.form.PanResponseForm;
import com.jocata.externalservices.services.PanServices;

public interface PanController {
    PanResponseForm getPanInfo(PanRequestForm panRequestForm);
}
