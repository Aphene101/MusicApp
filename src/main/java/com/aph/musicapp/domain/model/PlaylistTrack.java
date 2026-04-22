package com.aph.musicapp.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PlaylistTrack {
    private UUID playlistId;
    private UUID trackId;
}
