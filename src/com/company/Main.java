package com.company;

public class Main {

    public static void main(String[] args) {

        Hero artur = new Hero(250,150,30);
        System.out.println("Здоровьe Hero:" + artur.heroHealth);
        System.out.println("Урон Hero:" + artur.heroDamage);
        System.out.println("Урон от суперспособности Hero:" + artur.heroSuperPower);

        Boss boss = new Boss();
        boss.setBosshealth(400);
        boss.setBossDamage(60);
        boss.setBossDefenceType(40);

        System.out.println("");

        System.out.println(("Здоровьe Босса:" + boss.getBossHealth()));
        System.out.println(("Урон Босса:" + boss.getBossDamage()));
        System.out.println(("Защита Босса:" + boss.getBossDefenceType()));
        System.out.print("Тип защиты:");boss.bossChangeDefence();



    }
}