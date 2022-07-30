package com.analudias.moviechooser;

import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;

@SpringBootApplication
public class MoviechooserApplication {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int movieId = random.nextInt(1, 1000);
		
		TmdbMovies moviesApi = new TmdbApi(args[1]).getMovies();
		MovieDb dbMovie = moviesApi.getMovie(movieId, "en");
		
		System.out.println("Pela api: " + dbMovie);

	}

}
