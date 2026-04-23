package com.aph.musicapp.controller;

import com.aph.musicapp.application.service.GetTracksByPlaylistService;
import com.aph.musicapp.domain.model.Track;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.UUID;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {
    private final GetTracksByPlaylistService service;

    public PlaylistController(GetTracksByPlaylistService service) {
        this.service = service;
    }

    @GetMapping("/{id}/tracks")
    public Flux<Track> getTracks(@PathVariable UUID id) {
        return service.getTracks(id);
    }
}
