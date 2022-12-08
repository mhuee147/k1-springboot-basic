package com.nbstech.spring.basic.movierecommendersystems.Lesson3;

//import org.springframework.stereotype.Component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary

public class CollaborativeFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {
        // logic of collaborative based filter

        return new String[] {"CollaborativeFilter","Finding Nemo", "Ice Age", "Toy Story"};
    }

}
