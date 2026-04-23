package com.aph.musicapp.infrastructure.repository;

import com.aph.musicapp.domain.model.Playlist;
import com.aph.musicapp.domain.repository.PlaylistRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public class PostgresPlaylistRepository implements PlaylistRepository {
    @Override
    public Mono<Playlist> findById(UUID id) {
        return null;
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return null;
    }

    @Override
    public Flux<Playlist> findByUserId(UUID userId) {
        return null;
    }
}
