package com.graphql.graphql.datasource.problemz.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "solutionz")
@Data
public class Solutionz {

    @Id
    private UUID id;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;


    private String content;
    private String category;
    private int voteGoodCount;
    private int voteBadCount;

    @JoinColumn(name = "problemz_id",nullable = false)
    @ManyToOne
    private Problemz problemzId;

    @ManyToOne
    @JoinColumn(name = "created_by",nullable = false)
    private Userz createdBy;

}
