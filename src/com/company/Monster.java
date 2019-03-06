package com.company;

public class Monster {
    Random gen2 = new Random(-1, -2);

    public int getModificator() {

        return gen2.getRandom();
    }
}