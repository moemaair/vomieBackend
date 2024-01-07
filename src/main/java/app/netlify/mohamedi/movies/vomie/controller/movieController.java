package app.netlify.mohamedi.movies.vomie.controller;

import app.netlify.mohamedi.movies.vomie.model.Movie;
import app.netlify.mohamedi.movies.vomie.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/vomie")
public class movieController {


    private MovieService movieService;

    @Autowired
    public movieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    private ResponseEntity<List<Movie>> fetchallmovie(){
        return new ResponseEntity<List<Movie>>(movieService.allmovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Movie>> getMovieById(@PathVariable("id")ObjectId id){
        return new ResponseEntity<Optional<Movie>>(movieService.getMovieById(id),HttpStatus.OK);

    }
}
