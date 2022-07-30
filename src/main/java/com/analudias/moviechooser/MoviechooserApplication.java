package com.analudias.moviechooser;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.analudias.moviechooser.constants.ConstantsKey;

import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;

@SpringBootApplication
public class MoviechooserApplication {

	public static void main(String[] args) throws ParseException {
		
		Random random = new Random();
		int movieId = random.nextInt(1, 1000);
		
		TmdbMovies moviesApi = new TmdbApi(ConstantsKey.apiKey).getMovies();
		MovieDb dbMovie = moviesApi.getMovie(movieId, "en");
		
		String originalDateFormat = dbMovie.getReleaseDate();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD"); 
		Date date = (Date)formatter.parse(originalDateFormat);
		SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
		String newDateFormat = newFormat.format(date);
		
		System.out.println("Chosen movie: " + dbMovie.getOriginalTitle());
		System.out.println("Movie date: " + newDateFormat);

	}

}
