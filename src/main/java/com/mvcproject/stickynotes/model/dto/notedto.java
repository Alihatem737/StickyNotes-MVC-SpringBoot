package com.mvcproject.stickynotes.model.dto;

import jakarta.persistence.Column;
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
public class notedto {


    private Long id;

    private String note;
    private Long stickynoteid;
    private LocalDateTime createdat;
    private LocalDateTime updatedat;
}
