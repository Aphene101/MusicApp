package com.aph.musicapp.domain.repository;

import com.aph.musicapp.domain.model.Track;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface TrackRepository {
    Mono<Track> findById(UUID id);
    Mono<Track> save(Track track);
    Flux<Track> findAll();
    Flux<Track> findByAlbumId(UUID albumId);
}
