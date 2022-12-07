package com.nbstech.spring.basic.movierecommendersystems;


//import com.nbstech.spring.basic.movierecommendersystems.Lesson1.MovieRecommender;
//import com.nbstech.spring.basic.movierecommendersystems.Lesson1.ContentBasedFilter;
import com.nbstech.spring.basic.movierecommendersystems.Lesson2.CollaborativeFilter;
import com.nbstech.spring.basic.movierecommendersystems.Lesson2.ContentBasedFilter;
import org.springframework.boot.SpringApplication;
import com.nbstech.spring.basic.movierecommendersystems.Lesson3.MovieRecommender;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;



@SpringBootApplication
public class MovierecommendersystemsApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MovierecommendersystemsApplication.class, args);
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        ApplicationContext appContext = SpringApplication.run(MovierecommendersystemsApplication.class,args);
        //create object of RecommenderImplementation class
//        MovieRecommender recommender = new MovieRecommender(new ContentBasedFilter());
        MovieRecommender recommender =appContext.getBean(MovieRecommender.class);
        
        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }

}
