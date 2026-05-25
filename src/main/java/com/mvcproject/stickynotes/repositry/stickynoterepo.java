package com.mvcproject.stickynotes.repositry;

import com.mvcproject.stickynotes.model.enums.stickynote_status;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mvcproject.stickynotes.model.entity.stickynoteentity;

import java.util.List;

public interface stickynoterepo extends JpaRepository<stickynoteentity , Long> {

List<stickynoteentity> findAllByStatus(stickynote_status status);
}
