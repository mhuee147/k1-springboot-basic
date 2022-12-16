package com.nbstech.spring.basic.movierecommendersystems.ExternalProperty;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("huexinhgai")
public class ContentBasedFilter implements MovieFilter {

    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"ContentBasedFilter","Happy Feet", "Ice Age", "Shark Tale"};
    }
}
