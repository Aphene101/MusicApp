package domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Album {
    private String albumId;
    private String albumName;
    private String artistId;
    private LocalDate releaseDate;
}
