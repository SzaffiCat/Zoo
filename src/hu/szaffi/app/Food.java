package hu.szaffi.app;

import java.util.Random;

public enum Food {
    MEAT,
    VEGETABLE,
    FRUIT;

    public static Food getRandomFood(){
        Random rnd = new Random();
        return values()[rnd.nextInt(values().length)];
    }
}
