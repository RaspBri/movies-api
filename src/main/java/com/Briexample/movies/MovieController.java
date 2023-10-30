// REST API Controller
// AKA Request handler API layer
// Only concerned with getting a request from the user and returning a response
// Talks to Service

package com.Briexample.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Includes @Controller & @ResponseBody
@RequestMapping("/api/v1/movies") // general purpose request handling method
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    // ResponseEntity<T> extension of HttpEntity and adds HttpStatusCode
    public ResponseEntity<List<Movie>> getAllMovies(){
        // Check for response code in terminal
        // curl -i http://localhost:8080/api/vi/movies
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    // @PathVariable identifies and entity with a primary key, converts object to id
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
