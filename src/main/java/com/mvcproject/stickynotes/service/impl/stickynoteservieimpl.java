package com.mvcproject.stickynotes.service.impl;

import com.mvcproject.stickynotes.model.dto.addstickynotedto;
import com.mvcproject.stickynotes.model.dto.stickynotedto;
import com.mvcproject.stickynotes.model.dto.updatestickynotedto;
import com.mvcproject.stickynotes.model.entity.stickynoteentity;
import com.mvcproject.stickynotes.model.enums.stickynote_status;
import com.mvcproject.stickynotes.model.mapper.stickynotemapper;
import com.mvcproject.stickynotes.repositry.stickynoterepo;
import com.mvcproject.stickynotes.service.stickynoteservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class stickynoteservieimpl implements stickynoteservice {

    private final stickynoterepo Stickynoterepo;
    private final stickynotemapper Stickynotemapper;

    @Override
    public addstickynotedto addstickynote(addstickynotedto dto) {
        stickynoteentity stickynote = this.Stickynotemapper.toentity(dto);
        stickynote.setStatus(stickynote_status.Active);
        stickynoteentity saveentity = this.Stickynoterepo.save(stickynote);
        addstickynotedto addstickynotedto = this.Stickynotemapper.toaddDto(saveentity);

        return addstickynotedto;
    }

    @Override
    public List<addstickynotedto> allstickynotes() {
        List<stickynoteentity> all = this.Stickynoterepo.findAllByStatus(stickynote_status.Active);
        return this.Stickynotemapper.toaddDtos(all);
    }

    @Override
    public stickynotedto findbyid(Long id) {
        Optional<stickynoteentity> byid = this.Stickynoterepo.findById(id);
        return this.Stickynotemapper.toDto(byid.get());
    }

    @Override
    public void update(updatestickynotedto dto, Long id) {
        stickynoteentity entity = this.Stickynoterepo.findById(id).orElseThrow();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setColor(dto.getColor());
        entity.setStatus(dto.getStatus() != null ? dto.getStatus() : stickynote_status.Active);
        this.Stickynoterepo.save(entity);
    }
}
