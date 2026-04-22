package com.aph.musicapp.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class Album {
    private UUID albumId;
    private String albumName;
    private UUID artistId;
    private LocalDate releaseDate;
}
