package com.isep.rpg;

public class Potion {
    private  String potionName;
    private float potionQuantity;
    private String potionEffect;

    public Potion(String name, float quantity,String effect){
        potionName = name;
        potionQuantity = quantity;
        potionEffect = effect;
    }

    public String getPotionName(){
        return potionName;
    }
    public float getPotionQuantity(){
        return  potionQuantity;
    }
    public String getPotionEffect(){
        return potionEffect;
    }

}
