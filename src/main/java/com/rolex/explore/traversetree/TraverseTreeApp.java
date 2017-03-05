package com.rolex.explore.traversetree;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class TraverseTreeApp
{
	/**
	 * A movie might have multiple 'depths' of related movies. Sort the related movies
	 * based on their ratings descending. Original movie should not be considered for response
	 * If two movies have the same rating, order doesnt matter
	 * @param args
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public List<Movie> getTopRelatedMovies(Movie movie){

    	List<Movie> allRelatedMovies = new ArrayList<Movie>();

    	updateAllRelatedMovies(allRelatedMovies, movie);

    	MovieRatingComparator mrc = new MovieRatingComparator();
    	allRelatedMovies.sort(mrc);

    	return allRelatedMovies;
    }

    private void updateAllRelatedMovies(List<Movie> allRelatedMovies, Movie movie){
    	List<Movie> relatedMovies = movie.getRelatedMovies();
    	if(relatedMovies != null && relatedMovies.size() > 0){
    		allRelatedMovies.addAll(relatedMovies);
    		for(Movie relatedMovie : relatedMovies){
    			updateAllRelatedMovies(allRelatedMovies, relatedMovie);
    		}
    	}
    }
}
