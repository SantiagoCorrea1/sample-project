package com.santiago.MovieCatalog.controller;

import com.santiago.MovieCatalog.model.Movie;
import com.santiago.MovieCatalog.services.Movie_serviceDAO;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@PermitAll
public class MovieController {

    @Autowired
    private Movie_serviceDAO service;

    @GetMapping({"/movies", "/"})
    public  String listMovies(Model model, @Param("keyWord")String keyWord){
        model.addAttribute("movies", service.getAllMovies(keyWord));
        model.addAttribute("keyWord", keyWord);
        return "movies";
    }

    @GetMapping({"/admin"})
    public  String adminView(String keyWord, Model model){
        model.addAttribute("moviesAdmin", service.getAllMovies(keyWord));
        return "admin";
    }

    @GetMapping({"/admin/add"})
    public  String addMovie(Model model){
        Movie movie = new Movie();
        model.addAttribute("movie", movie);
        return "add";
    }

    @GetMapping({"/logger"})
    public  String logIn(Model model){
        Movie movie = new Movie();
        model.addAttribute("movie", movie);
        return "logger";
    }

    @PostMapping({"/admin"})
    public String addMovie(@ModelAttribute ("movie") Movie movie){
        service.createMovie(movie);

        return "redirect:/admin";
    }

    @GetMapping({"/admin/edit/{id}"})
    public String goToEdit(@PathVariable long id, Model model){
        model.addAttribute("movie", service.getMovieById(id));
        return "edit";
    }

    @PostMapping({"/admin/{id}"})
    public String updateMovie(@PathVariable long id, @ModelAttribute("movie")Movie movie){
        Movie existentMovie = service.getMovieById(id);
        existentMovie.setName(movie.getName());
        existentMovie.setPg(movie.getPg());
        existentMovie.setGenre(movie.getGenre());
        existentMovie.setStatus(movie.getStatus());
        service.updateMovieById(movie);
        return "redirect:/admin";
    }

    @GetMapping({"/admin/{id}"})
    public String deleteMovie(@PathVariable long id){
        service.deleteMovieById(id);
        return "redirect:/admin";
    }

}
