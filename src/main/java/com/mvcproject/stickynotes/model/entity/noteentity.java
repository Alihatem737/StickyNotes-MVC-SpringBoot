package com.mvcproject.stickynotes.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class noteentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private Long id;

    private String note;
    @Column(name = "sticky_note_id")
    private Long stickynoteid;



    @CreationTimestamp
    @Column(name = "createdat")
    private LocalDateTime createdat;
    @UpdateTimestamp
    @Column(name = "updatedat")
    private LocalDateTime updatedat;

}
