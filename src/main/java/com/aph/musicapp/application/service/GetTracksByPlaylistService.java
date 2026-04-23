package com.aph.musicapp.application.service;

import com.aph.musicapp.domain.model.Track;
import com.aph.musicapp.domain.repository.PlaylistTrackRepository;
import com.aph.musicapp.domain.repository.TrackRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Service
public class GetTracksByPlaylistService {
    private final PlaylistTrackRepository playlistTrackRepository;
    private final TrackRepository trackRepository;

    public GetTracksByPlaylistService(PlaylistTrackRepository playlistTrackRepository, TrackRepository trackRepository) {
        this.playlistTrackRepository = playlistTrackRepository;
        this.trackRepository = trackRepository;
    }

    public Flux<Track> getTracks(UUID playlistId) {
        return playlistTrackRepository.findByPlaylistId(playlistId)
                .flatMap(pt -> trackRepository.findById(pt.getTrackId()));
    }
}
