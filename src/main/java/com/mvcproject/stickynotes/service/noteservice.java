package com.mvcproject.stickynotes.service;

import com.mvcproject.stickynotes.model.dto.addnotedto;
import com.mvcproject.stickynotes.model.dto.notedto;

import java.util.List;

public interface noteservice {


    notedto add(addnotedto dto , Long stickynoteid  );
    List<notedto> getallnotes(Long stickynoteid);

    void deleteNote(Long id);

    List<notedto> getallnotes();

}
