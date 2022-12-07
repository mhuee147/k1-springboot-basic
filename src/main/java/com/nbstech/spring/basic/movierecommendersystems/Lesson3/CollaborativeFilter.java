package com.nbstech.spring.basic.movierecommendersystems.Lesson3;

import org.springframework.stereotype.Component;

@Component

public class CollaborativeFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {
        // logic of collaborative based filter

        return new String[] {"CollaborativeFilter","Finding Nemo", "Ice Age", "Toy Story"};
    }

}
