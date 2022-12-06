package com.company.Food;

import com.company.Food.Food;

public class Desert extends Food {

    public Desert(String name, int price, int volume) {
        super(name, price, volume);
    }

    @Override
    protected String feedSpeed() {
        return null;
    }
}
