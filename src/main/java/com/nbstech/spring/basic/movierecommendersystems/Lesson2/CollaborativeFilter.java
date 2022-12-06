package com.nbstech.spring.basic.movierecommendersystems.Lesson2;

public class CollaborativeFilter implements MovieFilter{
    public String[] getRecommendations(String movie) {

        // logic of collaborative based filter

        return new String[] {"CollaborativeFilter","Finding Nemo", "Ice Age", "Toy Story"};
    }

}
