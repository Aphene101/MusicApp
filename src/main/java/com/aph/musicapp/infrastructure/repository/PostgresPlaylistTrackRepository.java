package com.aph.musicapp.infrastructure.repository;

import com.aph.musicapp.domain.model.PlaylistTrack;
import com.aph.musicapp.domain.repository.PlaylistTrackRepository;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public class PostgresPlaylistTrackRepository implements PlaylistTrackRepository {
    private final DatabaseClient databaseClient;

    public PostgresPlaylistTrackRepository(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    @Override
    public Mono<PlaylistTrack> save(PlaylistTrack playlistTrack) {
        return databaseClient.sql("""
            INSERT INTO playlist_track (playlist_id, track_id)
            VALUES (:playlistId, :trackId)""")
                .bind("playlistId", playlistTrack.getPlaylistId())
                .bind("trackId", playlistTrack.getTrackId())
                .fetch()
                .rowsUpdated()
                .thenReturn(playlistTrack);
    }

    @Override
    public Flux<PlaylistTrack> findByPlaylistId(UUID playlistId) {
        return databaseClient.sql("""
            SELECT playlist_id, track_id
            FROM playlist_track
            WHERE playlist_id = :playlistId""")
                .bind("playlistId", playlistId)
                .map((row, metadata) -> {
                    PlaylistTrack pt = new PlaylistTrack();
                    pt.setPlaylistId(row.get("playlist_id", UUID.class));
                    pt.setTrackId(row.get("track_id", UUID.class));
                    return pt;
                        })
                .all();
    }
}
