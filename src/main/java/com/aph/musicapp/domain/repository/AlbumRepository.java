package com.aph.musicapp.domain.repository;

import com.aph.musicapp.domain.model.Album;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface AlbumRepository {
    Mono<Album> findById(UUID id);
    Mono<Album> save(Album album);
    Flux<Album> findByArtistId(UUID artistId);
}
