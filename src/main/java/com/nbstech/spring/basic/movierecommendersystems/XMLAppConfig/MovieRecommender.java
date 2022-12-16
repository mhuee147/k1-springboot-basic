package com.nbstech.spring.basic.movierecommendersystems.XMLAppConfig;

import org.springframework.stereotype.Component;

@Component

public class MovieRecommender {
    public MovieFilter getMovieFilter() {
        return movieFilter;
    }

    public void setMovieFilter(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }

    //    @Autowired
//     @Qualifier("huexinhgai")
        //use content based filter to find similar movies
    MovieFilter movieFilter;


    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        String[] results = movieFilter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}
