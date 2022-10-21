package com.isep.rpg;

public class Food {
    private  String foodName;
    private float foodQuantity;

    public  Food(String food, float quantity){
        foodName = food;
        foodQuantity = quantity;
    }
    public  String getFood(){
        return  foodName;
    }
    public float getQuantity(){
        return foodQuantity;
    }
}
