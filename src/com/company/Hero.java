package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperHit;
    public Hero(int heroHealth, int  heroDamage, String heroSuperHit) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperHit = heroSuperHit;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperHit() {
        return heroSuperHit;
    }
}
