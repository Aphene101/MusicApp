package com.aph.musicapp.infrastructure.repository;

import com.aph.musicapp.domain.model.Artist;
import com.aph.musicapp.domain.repository.ArtistRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public class PostgresArtistRepository implements ArtistRepository {
    @Override
    public Mono<Artist> findById(UUID id) {
        return null;
    }

    @Override
    public Mono<Artist> save(Artist artist) {
        return null;
    }

    @Override
    public Flux<Artist> findAll() {
        return null;
    }
}
