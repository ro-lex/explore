package com.rolex.explore.traversetree;

import java.util.List;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TraverseTreeAppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TraverseTreeAppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TraverseTreeAppTest.class );
    }

	private static Movie m1 = new Movie("m1", 4.3f);
	private static Movie m2 = new Movie("m2", 4.0f);
	private static Movie m3 = new Movie("m3", 4.1f);
	private static Movie m4 = new Movie("m4", 3.1f);
	private static Movie m5 = new Movie("m5", 4.1f);
	private static Movie m6 = new Movie("m6", 4.7f);
	private static Movie m7 = new Movie("m7", 3.9f);
	private static Movie m8 = new Movie("m8", 4.0f);
	private static Movie m9 = new Movie("m9", 4.9f);
	private static Movie m10 = new Movie("m10", 4.5f);

	private void refreshData(){
		m1 = new Movie("m1", 4.3f);
		m2 = new Movie("m2", 4.0f);
		m3 = new Movie("m3", 4.1f);
		m4 = new Movie("m4", 3.1f);
		m5 = new Movie("m5", 4.1f);
		m6 = new Movie("m6", 4.7f);
		m7 = new Movie("m7", 3.9f);
		m8 = new Movie("m8", 4.0f);
		m9 = new Movie("m9", 4.9f);
		m10 = new Movie("m10", 4.5f);

	}

    public void testRating1(){
    	refreshData();
    	m1.addRelatedMovie(m2);
    	m1.addRelatedMovie(m5);
    	m1.addRelatedMovie(m6);
    	TraverseTreeApp app = new TraverseTreeApp();
    	List<Movie> topRelatedMovies = app.getTopRelatedMovies(m1);
    	Assert.assertEquals(3, topRelatedMovies.size());
    	Assert.assertEquals(m6, topRelatedMovies.get(0));
    	Assert.assertEquals(m5, topRelatedMovies.get(1));
    	Assert.assertEquals(m2, topRelatedMovies.get(2));
    	System.out.println("*******************************************");
    	for(Movie topMovie : topRelatedMovies){
    		System.out.println("Id: " + topMovie.getId() + ", Rating: " + topMovie.getRating() );
    	}

    }

    /**
     * m7()
     * m2(4.0) 			m3(4.1)
     * m4(3.1) m5(4.1)	m1(4.3)
     * 					m6(4.7) m8(4.0) m10(4.5)
     * Also tests multiple movies with the same rating
     */
    public void testRating2(){
    	refreshData();
    	m1.addRelatedMovie(m6);
    	m1.addRelatedMovie(m8);
    	m1.addRelatedMovie(m10);
    	m2.addRelatedMovie(m5);
    	m2.addRelatedMovie(m4);
    	m3.addRelatedMovie(m1);
    	m7.addRelatedMovie(m2);
    	m7.addRelatedMovie(m3);

    	TraverseTreeApp app = new TraverseTreeApp();
    	List<Movie> topRelatedMovies = app.getTopRelatedMovies(m7);
    	Assert.assertEquals(8, topRelatedMovies.size());
    	Assert.assertEquals(m6, topRelatedMovies.get(0));
    	Assert.assertEquals(m10, topRelatedMovies.get(1));
    	Assert.assertEquals(m1, topRelatedMovies.get(2));
    	Assert.assertEquals(m5, topRelatedMovies.get(3));
    	Assert.assertEquals(m3, topRelatedMovies.get(4));
    	Assert.assertEquals(m8, topRelatedMovies.get(5));
    	Assert.assertEquals(m2, topRelatedMovies.get(6));
    	Assert.assertEquals(m4, topRelatedMovies.get(7));
    	System.out.println("*******************************************");
    	for(Movie topMovie : topRelatedMovies){
    		System.out.println("Id: " + topMovie.getId() + ", Rating: " + topMovie.getRating() );
    	}


    }
}
