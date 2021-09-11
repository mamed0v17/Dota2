package com.company;

public class Froid extends Heroes implements Printable{
    String dome;
    public Froid(String name, int health, String dome) {
        super(name, health);
        this.dome = dome;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getHealth());
        System.out.println(dome);

    }
}
