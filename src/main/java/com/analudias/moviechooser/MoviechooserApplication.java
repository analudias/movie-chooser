package com.analudias.moviechooser;

import java.util.Random;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.analudias.moviechooser.entities.Movie;

@SpringBootApplication
public class MoviechooserApplication {

	public static void main(String[] args) {
		Random random = new Random();
		
		int movieId = random.nextInt(1,1000);
		
		RestTemplate restTemplate = new RestTemplate();
		
		System.out.println("api key: " + args[1]);
		
		Movie movie = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key="+ args[1], Movie.class);
		
		System.out.println("Chosen movie is " + movie.getoriginal_title());
		
	}

}
