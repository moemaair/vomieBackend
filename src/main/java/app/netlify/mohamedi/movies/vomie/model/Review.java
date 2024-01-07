package app.netlify.mohamedi.movies.vomie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId reviewId;
    private String reviewBody;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Review(String reviewBody, LocalDateTime created, LocalDateTime updated) {
        this.reviewBody = reviewBody;
        this.created = created;
        this.updated = updated;
    }
}
