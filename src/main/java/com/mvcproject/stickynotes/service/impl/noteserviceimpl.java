package com.mvcproject.stickynotes.service.impl;

import com.mvcproject.stickynotes.model.dto.addnotedto;
import com.mvcproject.stickynotes.model.dto.notedto;
import com.mvcproject.stickynotes.model.entity.noteentity;
import com.mvcproject.stickynotes.model.mapper.notemapper;
import com.mvcproject.stickynotes.repositry.noterepo;
import com.mvcproject.stickynotes.service.noteservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class noteserviceimpl implements noteservice {

    private final noterepo noterepo;
    private final notemapper notemapper;

    @Override
    public notedto add(addnotedto dto, Long stickynoteid) {

        noteentity entity = this.notemapper.toentity(dto);
        entity.setStickynoteid(stickynoteid);
        noteentity savedentity= this.noterepo.save(entity);
        return this.notemapper.todto(savedentity);
    }

    @Override
    public List<notedto> getallnotes(Long stickynoteid) {
        List<noteentity> notes=this.noterepo.findAllBystickynoteidOrderByIdDesc(stickynoteid);
        return this.notemapper.todtos(notes);
    }

    @Override
    public void deleteNote(Long id) {
        noterepo.deleteById(id);
    }

    @Override
    public List<notedto> getallnotes() {
        List<noteentity> notes =this.noterepo.findAll();
        return this.notemapper.todtos(notes);
    }
}
