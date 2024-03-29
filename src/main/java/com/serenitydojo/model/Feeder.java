package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.TUNA;
import static com.serenitydojo.model.FoodType.SALMON;
import static com.serenitydojo.model.FoodType.DOG_FOOD;
import static com.serenitydojo.model.FoodType.DELUXE_DOG_FOOD;
import static com.serenitydojo.model.FoodType.CABBAGE;
import static com.serenitydojo.model.FoodType.LETTUCE;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? SALMON : TUNA;
        } else if (animal.equals("Dog")) {
            return DOG_FOOD;
        }

        return CABBAGE;

    }
}
