package com.company.Food;

public class Salat extends Food {

    public Salat(String name, int price, int volume) {
        super(name, price, volume);
    }

    @Override
    protected String feedSpeed() {
        return null;
    }
}
