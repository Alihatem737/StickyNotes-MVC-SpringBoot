package com.mvcproject.stickynotes.model.dto;

import com.mvcproject.stickynotes.model.enums.stickynote_status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class stickynotedto {



    public Long id;
    private String description;
    private String name;
    private stickynote_status status;
    public String color;
    private LocalDateTime createdat;
    private LocalDateTime updatedat;

}
