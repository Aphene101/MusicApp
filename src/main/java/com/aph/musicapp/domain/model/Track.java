package com.aph.musicapp.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Track {
    private UUID trackId;
    private String trackName;
    private UUID albumId;
    private Integer duration;
}
