package com.Briexample.movies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies") // table
@Data // Takes care of getters & setters
@AllArgsConstructor // Creates constructors that takes all the private fields as arguments
@NoArgsConstructor // Creates constructors that do not take any parameters
public class Movie {
    @Id // unique ID of each table item
    // fields listed below (columns)
    private ObjectId id; // id of the movie
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink; // youtube movie link
    private String poster;
    private List<String> genres;
    private List<String> backdrops;


}
