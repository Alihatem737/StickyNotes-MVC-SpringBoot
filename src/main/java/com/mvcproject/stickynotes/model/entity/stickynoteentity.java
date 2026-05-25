package com.mvcproject.stickynotes.model.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.mvcproject.stickynotes.model.enums.stickynote_status;

import java.time.LocalDateTime;


@Entity
@Table(name = "stickynote")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class stickynoteentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stickynote_id")
    public Long id;


    private String description;
    private String name;
    public String color;
    @Enumerated(EnumType.STRING)
    private stickynote_status status;



    @CreationTimestamp
    @Column(name = "createdat")
    private LocalDateTime createdat;
    @UpdateTimestamp
    @Column(name = "updatedat")
    private LocalDateTime updatedat;





}
