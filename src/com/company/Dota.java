package com.company;

public class Dota {

    public static void main(String[] args) {
        Heroes[] arrayHeroes = {createObject("Ursa"), createObject("Froid"),
                createObject("Legion_Champion")};

        for (Heroes a : arrayHeroes) {
            a.print();



        }
    }

    public static Heroes createObject(String className) {
        switch (className) {
            case "Ursa":
                Ursa ursa = new Ursa("Balu", 500, "BALU JUMPED");
                return ursa;
            case "Froid":
                Froid froid = new Froid("Spirit", 420, "Froid put the dome");
                return froid;
            case "Legion_Champion":
                Legion_Champion legion_champion = new Legion_Champion("Legionka", 480, "Legion gave a duel");
                return legion_champion;

        }
        return null;
    }
}