package com.santiago.MovieCatalog.services;

import com.santiago.MovieCatalog.model.Movie;

import java.util.List;

public interface Movie_service {
    public List<Movie> getAllMovies(String keyWord);
    public Movie createMovie(Movie movie);
    public Movie getMovieById(Long id);
    public  Movie updateMovieById(Movie movie);
    public void deleteMovieById(Long id);

}
