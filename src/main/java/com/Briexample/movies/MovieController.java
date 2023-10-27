// REST API Controller
// AKA Request handler API layer
// Only concerned with getting a request from the user and returning a response
// Talks to Service

package com.Briexample.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Includes @Controller & @ResponseBody
@RequestMapping("/api/vi/movies") // general purpose request handling method
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
}
