package com.nyetflix.repositories;

import com.nyetflix.entities.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Steven on 4/07/2018.
 */
public interface MovieRepository extends MongoRepository<Movie, String> {

    List<Movie> findByTitle(String Title);

}
