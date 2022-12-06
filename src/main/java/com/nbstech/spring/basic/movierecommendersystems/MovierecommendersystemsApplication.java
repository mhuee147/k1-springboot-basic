package com.nbstech.spring.basic.movierecommendersystems;

import com.nbstech.spring.basic.movierecommendersystems.Lesson1.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovierecommendersystemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovierecommendersystemsApplication.class, args);
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //create object of RecommenderImplementation class
        MovieRecommender recommender = new MovieRecommender();

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }

}
