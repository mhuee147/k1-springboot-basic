package com.nbstech.spring.basic.movierecommendersystems.Lesson2;

public class MovieRecommender {

        //use content based filter to find similar movies
        MovieFilter movieFilter;
            public MovieRecommender(MovieFilter movieFilter){
                super();
                this.movieFilter = movieFilter;
            }

    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        String[] results = movieFilter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
