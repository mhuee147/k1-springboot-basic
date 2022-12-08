package com.nbstech.spring.basic.movierecommendersystems.Lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class MovieRecommender {
    @Autowired
     @Qualifier("huexinhgai")
        //use content based filter to find similar movies
        MovieFilter contentBasedFilter;


    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        String[] results = contentBasedFilter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
