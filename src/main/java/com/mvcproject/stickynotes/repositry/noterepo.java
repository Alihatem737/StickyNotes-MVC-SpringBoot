package com.mvcproject.stickynotes.repositry;

import com.mvcproject.stickynotes.model.entity.noteentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface noterepo extends JpaRepository<noteentity , Long> {

    List<noteentity> findAllBystickynoteidOrderByIdDesc(Long id);


}
