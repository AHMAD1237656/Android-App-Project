package com.example.fruitslistview;

public class FoodModel {
    // Variables for image and text
    int foodImage;
    String foodName;

    // Constructor
    public FoodModel(int foodImage, String foodName) {
        this.foodImage = foodImage;
        this.foodName = foodName;
    }

    // Getter methods
    public int getFoodImage() {
        return foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    // Setter methods (optional, agar future mein update karna ho)
    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
