package com.isep.rpg;

public abstract class Combatant {
    private String combatantName;
    private  int healthPoint;

    public Combatant (String name, int health){
        combatantName = name;
        healthPoint = health;
    }

    public String getCombatantName(){
        return combatantName;
    }
    public int getHealthPoint(){
        return healthPoint;
    }
    public abstract void fight(Combatant combatant);
    public void loose(int hp){
        healthPoint -= hp;
    }
}
