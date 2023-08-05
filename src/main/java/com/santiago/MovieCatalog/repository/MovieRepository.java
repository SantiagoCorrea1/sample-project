package com.santiago.MovieCatalog.repository;

import com.santiago.MovieCatalog.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Long> {
    @Query ("SELECT m FROM Movie m WHERE m.name LIKE %?1%"
            + " or m.pg like %?1%"
            + " or m.genre like %?1%"
            + " or m.status like %?1%")
    List<Movie> finAll(String keyWord);
}
