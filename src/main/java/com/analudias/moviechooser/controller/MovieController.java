package com.analudias.moviechooser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.analudias.moviechooser.constants.ConstantsKey;
import com.analudias.moviechooser.entities.Movie;

import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.TmdbMovies.MovieMethod;
import info.movito.themoviedbapi.model.MovieImages;
import info.movito.themoviedbapi.tools.ApiUrl;

@RestController
public class MovieController {

	@ResponseBody
	@GetMapping(value = "/{randomId}")
	public Movie movieByRandomId(@PathVariable int randomId) {
		
		RestTemplate restTemplate = new RestTemplate();
		Movie movie = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + randomId + "?api_key="+ ConstantsKey.apiKey, Movie.class);
		movie.setMoviePoster("https://image.tmdb.org/t/p/original" + movie.getMoviePoster());
		return movie;
	}

}
