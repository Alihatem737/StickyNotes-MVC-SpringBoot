package com.mvcproject.stickynotes.model.mapper;


import com.mvcproject.stickynotes.model.dto.addnotedto;
import com.mvcproject.stickynotes.model.dto.notedto;
import com.mvcproject.stickynotes.model.entity.noteentity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface notemapper {


    notedto todto(noteentity entity);
    noteentity toentity(notedto dto);
    List<notedto> todtos(List<noteentity> entites);


    noteentity toentity(addnotedto dto);
}
