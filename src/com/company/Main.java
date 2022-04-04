package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(800);
        boss.setBossDamage(60);
        boss.setBossDefence("Magical");
        System.out.println("BossHealth:" + " " + boss.getBossHealth() + " " + "BossDamage:" + boss.getBossDamage()
                + " " + " " + "BossTypeDefence:" + " " + boss.getBossDefence());

        for (Hero hero : createHeroes()) {
            System.out.println("HeroHealth:" + hero.getHeroHealth() + " " + "heroDamage:" + hero.getHeroDamage() + " " +
                    "HeroTypeDefence:" + hero.getHeroSuperHit());
        }
    }


    public static Hero[] createHeroes() {

        Hero hero = new Hero(300, 30, "hero");

        Hero hero1 = new Hero(250, 35, "Hero1");

        Hero hero2 = new Hero(200, 25, "hero2");

        return new Hero[]{hero, hero1, hero2};
    }
}