package com.aph.musicapp.domain.repository;

import com.aph.musicapp.domain.model.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface PlaylistRepository {
    Mono<Playlist> findById(UUID id);
    Mono<Playlist> save(Playlist playlist);
    Flux<Playlist> findByUserId(UUID userId);
}
