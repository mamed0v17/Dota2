package com.company;


public  class Ursa extends Heroes implements Printable {

    String stun;


    public Ursa(String name, int health, String stun) {

        super(name, health);
        this.stun = stun;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getHealth());
        System.out.println(stun);
    }

}
