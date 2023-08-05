package com.santiago.MovieCatalog.services;

import com.santiago.MovieCatalog.model.Movie;
import com.santiago.MovieCatalog.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class Movie_serviceDAO implements Movie_service{

    @Autowired
    private MovieRepository repository;

    @Override
    public List<Movie> getAllMovies(String keyWord) {
        if(keyWord != null){
            return repository.finAll(keyWord);
        }
        return repository.findAll();
    }

    @Override
    public Movie createMovie(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public Movie getMovieById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Movie updateMovieById(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public void deleteMovieById(Long id) {
        repository.deleteById(id);
    }

}
