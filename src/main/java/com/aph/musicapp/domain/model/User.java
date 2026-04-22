package com.aph.musicapp.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class User {
    private UUID userId;
    private String username;
    private String email;
    private Instant createdAt;
}
