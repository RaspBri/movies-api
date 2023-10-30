// Business logic, exchange of info between database and user interface
// Uses Repository class, talks to the movies service, and returns to the database layer

package com.Briexample.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service // marks class as service provider
public class MovieService {
    @Autowired // tells framework to instantiate this class (AKA create an object)
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll(); // returns list of data
    }

    // Optional - may not be a value, does not use null as return type
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
