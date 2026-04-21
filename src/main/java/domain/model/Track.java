package domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
public class Track {
    private String trackId;
    private String trackName;
    private String albumId;
    private Duration duration;
}
