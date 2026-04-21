package domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class Playlist {
    private String playlistId;
    private String userId;
    private String playlistName;
    private Instant createdAt;

}
