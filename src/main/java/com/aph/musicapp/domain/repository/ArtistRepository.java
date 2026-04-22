package com.aph.musicapp.domain.repository;

import com.aph.musicapp.domain.model.Artist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface ArtistRepository {
    Mono<Artist> findById(UUID id);
    Mono<Artist> save(Artist artist);
    Flux<Artist> findAll();
}
