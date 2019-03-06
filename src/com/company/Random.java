package com.company;

public class Random {
    private int min;
    private int max;

    Random(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandom() {
        return min + (int) (Math.random() * max);
    }
}