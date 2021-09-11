package com.company;

public abstract class Heroes {
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Heroes(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public abstract void print();
}


