package com.nbstech.spring.basic.movierecommendersystems;


//import com.nbstech.spring.basic.movierecommendersystems.Lesson1.MovieRecommender;
//import com.nbstech.spring.basic.movierecommendersystems.Lesson1.ContentBasedFilter;

import com.nbstech.spring.basic.movierecommendersystems.Lesson3.MovieRecommender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan

//@SpringBootApplication
public class MovierecommendersystemsApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MovierecommendersystemsApplication.class, args);
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//        ApplicationContext appContext = SpringApplication.run(MovierecommendersystemsApplication.class,args);
        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(MovierecommendersystemsApplication.class);
        //create object of RecommenderImplementation class
//        MovieRecommender recommender = new MovieRecommender(new ContentBasedFilter());
        MovieRecommender recommender =appContext.getBean(MovieRecommender.class);
        
        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }

}
