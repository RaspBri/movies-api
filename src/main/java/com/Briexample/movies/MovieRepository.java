// Data access layer
// Talks to database to retrieve data

package com.Briexample.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // Encapsulate logic required to access data sources
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
