package com.aph.musicapp.domain.repository;

import com.aph.musicapp.domain.model.PlaylistTrack;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface PlaylistTrackRepository {
    Mono<PlaylistTrack> save(PlaylistTrack playlistTrack);
    Flux<PlaylistTrack> findByPlaylistId(UUID playlistId);
}
