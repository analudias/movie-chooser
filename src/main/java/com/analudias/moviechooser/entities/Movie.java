package com.analudias.moviechooser.entities;

import java.time.LocalDate;

public class Movie {
	
	private Long id;
	private String original_title;
	private LocalDate date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getoriginal_title() {
		return original_title;
	}
	public void setoriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
