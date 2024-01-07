package app.netlify.mohamedi.movies.vomie.service;

import app.netlify.mohamedi.movies.vomie.model.Movie;
import app.netlify.mohamedi.movies.vomie.repository.MovieReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
