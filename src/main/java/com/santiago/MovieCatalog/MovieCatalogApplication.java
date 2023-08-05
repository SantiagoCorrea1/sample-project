package com.santiago.MovieCatalog;

import com.santiago.MovieCatalog.model.Movie;
import com.santiago.MovieCatalog.repository.MovieRepository;
import com.santiago.MovieCatalog.services.Movie_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieCatalogApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApplication.class, args);
	}

		@Autowired
		private MovieRepository repository;

		@Override
		public void run(String... args) throws Exception {
	}
}
