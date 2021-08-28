package com.company;

public class Hero<heroHealth, heroDamage, heroSuperPower> {

    private final int heroHealth;

    public Hero(){

    }

    int private heroHealth;
    int private heroDamage;
    int private heroSuperPower;


    public Hero(int heroHealth, int heroDamage, int heroSuperPower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperPower = heroSuperPower;

    }
}