// Business logic, exchange of info between database and user interface
// Uses Repository class, talks to the movies service, and returns to the database layer

package com.Briexample.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // marks class as service provider
public class MovieService {
    @Autowired // tells framework to instantiate this class (AKA create an object)
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll(); // returns list of data
    }
}
