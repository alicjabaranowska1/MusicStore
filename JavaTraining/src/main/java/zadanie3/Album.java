package zadanie3;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Album {

    private List<Artist> artists;
    private Price price;
    private Type type;
    private long publicationYear;

}
