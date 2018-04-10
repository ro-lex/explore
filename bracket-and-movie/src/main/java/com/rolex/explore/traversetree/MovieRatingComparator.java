package com.rolex.explore.traversetree;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie>{

	public int compare(Movie o1, Movie o2) {
		if(o1.getRating() < o2.getRating()){
			return 1;
		}else if(o1.getRating() > o2.getRating()){
			return -1;
		}else{
			//If ratings are equal, always return reverse sorted order of names
			return o2.getId().compareTo(o1.getId());
		}
	}

}
