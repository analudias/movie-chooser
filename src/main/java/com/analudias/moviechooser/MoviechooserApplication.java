package com.analudias.moviechooser;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.analudias.moviechooser.constants.ConstantsKey;
import com.analudias.moviechooser.entities.Movie;

@SpringBootApplication
public class MoviechooserApplication {

	public static void main(String[] args) throws ParseException {
		
		Random random = new Random();

		int movieId = random.nextInt(550);

		RestTemplate restTemplate = new RestTemplate();

		Movie movie = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key="+ ConstantsKey.apiKey, Movie.class);
		
		String originalDateFormat = movie.getDate();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD"); 
		Date date = (Date)formatter.parse(originalDateFormat);
		SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
		String newDateFormat = newFormat.format(date);

		System.out.println("Chosen movie is " + movie.getOriginalTitle());
		System.out.println("The release date is: " + newDateFormat);

	}

}
