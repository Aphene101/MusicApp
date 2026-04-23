package com.aph.musicapp.infrastructure.repository;

import com.aph.musicapp.domain.model.Track;
import com.aph.musicapp.domain.repository.TrackRepository;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;
import java.time.Duration;

@Repository
public class PostgresTrackRepository implements TrackRepository {
    private final DatabaseClient databaseClient;

    public PostgresTrackRepository(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    @Override
    public Mono<Track> findById(UUID id) {
        return databaseClient.sql("""
            SELECT track_id, track_name, album_id, duration
            FROM track
            WHERE track_id = :id""")
                .bind("id", id)
                .map((row, metadata) -> {
                            Track track = new Track();
                            track.setTrackId(row.get("track_id", UUID.class));
                            track.setTrackName(row.get("track_name", String.class));
                            track.setAlbumId(row.get("album_id", UUID.class));
                            track.setDuration(row.get("duration", Duration.class));
                            return track;
                        })
                .one();
    }

    @Override
    public Mono<Track> save(Track track) {
        return null;
    }

    @Override
    public Flux<Track> findAll() {
        return null;
    }

    @Override
    public Flux<Track> findByAlbumId(UUID albumId) {
        return null;
    }
}
