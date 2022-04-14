package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.weapon.setNameWeapon("AWM");
        boss.weapon.setTypeWeapon("Snipers");
        boss.printInfo();
    }
}
