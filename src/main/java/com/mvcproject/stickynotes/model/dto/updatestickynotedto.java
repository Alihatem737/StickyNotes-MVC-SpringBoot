package com.mvcproject.stickynotes.model.dto;


import com.mvcproject.stickynotes.model.enums.stickynote_status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class updatestickynotedto {


    private Long id;
    private String description;
    private String name;
    public String color;
    private stickynote_status status;
//    private LocalDateTime createdat;
//    private LocalDateTime updatedat;

}
