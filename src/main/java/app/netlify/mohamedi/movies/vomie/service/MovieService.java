package app.netlify.mohamedi.movies.vomie.service;

import app.netlify.mohamedi.movies.vomie.model.Movie;
import app.netlify.mohamedi.movies.vomie.repository.MovieReposiory;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private MovieReposiory movieReposiory;

    @Autowired
    public MovieService(MovieReposiory movieReposiory) {
        this.movieReposiory = movieReposiory;
    }

    public List<Movie> allmovies(){
        return movieReposiory.findAll();
    }

    public Optional<Movie> getMovieById(ObjectId id){
        return movieReposiory.findById(id);
    }
}
