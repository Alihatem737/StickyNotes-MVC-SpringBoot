package com.mvcproject.stickynotes.model.dto;

import com.mvcproject.stickynotes.model.enums.stickynote_status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class addstickynotedto {


    private Long id;
    private String description;
    private String name;
    public String color;
    private LocalDateTime createdat;

}
