package app.netlify.mohamedi.movies.vomie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collation = "movies_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class movie {
    @Id
    private ObjectId movieId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    private List<Review> reviewIds;
}
