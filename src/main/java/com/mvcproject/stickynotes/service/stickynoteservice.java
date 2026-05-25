package com.mvcproject.stickynotes.service;


import com.mvcproject.stickynotes.model.dto.addstickynotedto;
import com.mvcproject.stickynotes.model.dto.stickynotedto;
import com.mvcproject.stickynotes.model.dto.updatestickynotedto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface stickynoteservice {

    addstickynotedto addstickynote(addstickynotedto dto);
    List<addstickynotedto> allstickynotes();

    stickynotedto findbyid(Long id);

    void update (updatestickynotedto dto , Long id);
}
