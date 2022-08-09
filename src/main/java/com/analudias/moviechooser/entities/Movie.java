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
}
