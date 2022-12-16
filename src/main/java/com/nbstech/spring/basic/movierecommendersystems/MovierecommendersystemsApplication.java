package com.nbstech.spring.basic.movierecommendersystems;


//import com.nbstech.spring.basic.movierecommendersystems.Lesson1.MovieRecommender;
//import com.nbstech.spring.basic.movierecommendersystems.Lesson1.ContentBasedFilter;

import com.nbstech.spring.basic.movierecommendersystems.ExternalProperty.MovieRecommender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@ComponentScan(basePackages =  "com.nbstech.spring.basic.movierecommendersystems.ExternalProperty")
@PropertySource("classpath:app.properties")
//@SpringBootApplication
public class MovierecommendersystemsApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MovierecommendersystemsApplication.class, args);
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//        ApplicationContext appContext = SpringApplication.run(MovierecommendersystemsApplication.class,args);
        AnnotationConfigApplicationContext appContext =
                new AnnotationConfigApplicationContext(MovierecommendersystemsApplication.class);
//        //create object of RecommenderImplementation class
//        MovieRecommender recommender = new MovieRecommender(new ContentBasedFilter());
        //== XML App Config: load the configuration file
//        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("AppContext.xml");

        MovieRecommender recommender =appContext.getBean(MovieRecommender.class);
        
        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
        System.out.println(recommender.getFavoriteMovie());
        appContext.close();
    }

}
