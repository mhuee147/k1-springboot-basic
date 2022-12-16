package com.nbstech.spring.basic.movierecommendersystems.XMLAppConfig;

//import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

//@Component
//@Primary

public class CollaborativeFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {
        // logic of collaborative based filter

        return new String[] {"CollaborativeFilter","Finding Nemo", "Ice Age", "Toy Story"};
    }

}
