package com.isep.rpg;

public class Food {
    private  String foodName;
    private float foodQuantity;

    public  Food(String food, float quantity){
        foodName = food;
        foodQuantity = quantity;
    }
    public  String GetFood(){
        return  foodName;
    }
    public float GetQuantity(){
        return foodQuantity;
    }
}
