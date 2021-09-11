package com.company;

public class Legion_Champion extends Heroes implements Printable{
    String duel;
    public Legion_Champion(String name, int health, String duel) {
        super(name, health);
        this.duel = duel;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getHealth());
        System.out.println(duel);

    }
}
