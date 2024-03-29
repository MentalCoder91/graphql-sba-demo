package com.graphql.graphql.datasource.problemz.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "userz_token")
@Data
public class UserzToken {

    @Id
    private UUID userId;
    private String authToken;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;

    private LocalDateTime expiryTimestamp;


}
