package app.netlify.mohamedi.movies.vomie.repository;


import app.netlify.mohamedi.movies.vomie.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieReposiory extends MongoRepository<Movie, ObjectId> {
      Optional<Movie> findMovieByimdbId(String imdbId);

}
