package com.graphql.graphql.datasource.problemz.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "problemz")
@Data
public class Problemz {

    @Id
    private UUID id;

    private LocalDateTime creationTimestamp;

    private String title;

    private String content;

    private String tags;

    @OneToMany(mappedBy = "problemzId",cascade = CascadeType.ALL)
    private List<Solutionz> solutions;

    @ManyToOne
    @JoinColumn(name = "created_by",nullable = false)
    private Userz createdBy;


}
