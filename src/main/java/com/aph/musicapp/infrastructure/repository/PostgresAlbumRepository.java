package com.aph.musicapp.infrastructure.repository;

import com.aph.musicapp.domain.model.Album;
import com.aph.musicapp.domain.repository.AlbumRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public class PostgresAlbumRepository implements AlbumRepository {
    @Override
    public Mono<Album> findById(UUID id) {
        return null;
    }

    @Override
    public Mono<Album> save(Album album) {
        return null;
    }

    @Override
    public Flux<Album> findByArtistId(UUID artistId) {
        return null;
    }
}
