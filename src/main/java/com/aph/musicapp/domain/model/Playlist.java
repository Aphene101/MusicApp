package com.aph.musicapp.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Setter
@Getter
public class Playlist {
    private UUID playlistId;
    private UUID userId;
    private String playlistName;
    private Instant createdAt;

}
