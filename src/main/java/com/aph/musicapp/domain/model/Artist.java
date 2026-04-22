package com.aph.musicapp.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Artist {
    private UUID artistId;
    private String artistName;
}
