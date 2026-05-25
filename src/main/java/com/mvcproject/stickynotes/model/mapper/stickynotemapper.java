package com.mvcproject.stickynotes.model.mapper;


import com.mvcproject.stickynotes.model.dto.addstickynotedto;
import com.mvcproject.stickynotes.model.dto.updatestickynotedto;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import com.mvcproject.stickynotes.model.dto.stickynotedto;
import com.mvcproject.stickynotes.model.entity.stickynoteentity;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface stickynotemapper {

    @Mapping(source = "id", target = "id")

    stickynotedto toDto(stickynoteentity entity);
    stickynoteentity toentity(stickynotedto dto);

    List<stickynoteentity> toentites(List<stickynotedto> dtos);
    List<stickynotedto> todtos(List<stickynoteentity> entitess);


    @Mapping(target = "status", ignore = true)
    @Mapping(target = "updatedat", ignore = true)
    stickynoteentity toentity(addstickynotedto dto);

    addstickynotedto toaddDto(stickynoteentity saveentity);


    List<addstickynotedto> toaddDtos(List<stickynoteentity> entities);

    stickynoteentity toentity(updatestickynotedto dto);
}
