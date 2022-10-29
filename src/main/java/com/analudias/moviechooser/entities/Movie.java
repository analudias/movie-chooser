package com.analudias.moviechooser.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
	
	private Long id;
	
	@JsonProperty("original_title")
	private String originalTitle;
	
	@JsonProperty("release_date")
	private String date;
	
	@JsonProperty("poster_path")
	private String moviePoster;
	
	@JsonProperty("adult")
	private boolean adult;

	public Movie() {
	}

	public Movie(Long id, String originalTitle, String date, String moviePoster, boolean adult) {
		this.id = id;
		this.originalTitle = originalTitle;
		this.date = date;
		this.moviePoster = moviePoster;
		this.adult = adult;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getMoviePoster() {
		return moviePoster;
	}

	public void setMoviePoster(String moviePoster) {
		this.moviePoster = moviePoster;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}
}
