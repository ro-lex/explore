package com.rolex.explore.traversetree;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	public Movie(String id, float rating){
		this.id = id;
		this.rating = rating;
	}

	private String id;

	private float rating;

	private List<Movie> relatedMovies;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public List<Movie> getRelatedMovies() {
		return relatedMovies;
	}

	public void setRelatedMovies(List<Movie> relatedMovies) {
		this.relatedMovies = relatedMovies;
	}

	public void addRelatedMovie(Movie movie){
		if(this.relatedMovies == null){
			this.relatedMovies = new ArrayList<Movie>();
		}
		this.relatedMovies.add(movie);
	}

}
