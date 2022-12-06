package com.company.Food;

import com.company.Food.Food;

import java.io.File;

public class Napitki extends Food {

    public Napitki(String name, int price, int volume) {
        super(name, price, volume);
    }

    @Override
    protected String feedSpeed() {
        return null;
    }
}
