package lut16;

import lut16.pl.sda.creational.factory.Profession;
import lut16.pl.sda.creational.factory.Warrior;

public class App {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Legolas", 9001, Profession.ARCHER);
        warrior.changeProfession(Profession.SWORDSMAN);
    }
}
