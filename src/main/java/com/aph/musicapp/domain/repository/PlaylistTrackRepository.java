package com.aph.musicapp.domain.repository;

import java.util.UUID;

public interface PlaylistTrackRepository {
    Mono<PlaylistTrack> save(PlaylistTrack playlistTrack);
    Flux<PlaylistTrack> findByPlaylistId(UUID playlistId);
}
