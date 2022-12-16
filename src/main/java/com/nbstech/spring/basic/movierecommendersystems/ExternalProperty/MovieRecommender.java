package com.nbstech.spring.basic.movierecommendersystems.ExternalProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class MovieRecommender {
    @Autowired
     @Qualifier("huexinhgai")
        //use content based filter to find similar movies
    MovieFilter contentBasedFilter;

    @Value("${movieRecommender.favoriteMovie: hello}")
    private String favoriteMovie;

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        String[] results = contentBasedFilter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
