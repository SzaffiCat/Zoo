package hu.szaffi.app.animal;

import hu.szaffi.app.Food;

public abstract class Animal {
    String name;
    int weight;
    int overWeight;
    boolean alive;
    int reactToMeat;
    int reactToVegetable;
    int reactToFruit;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.alive = true;
    }

    int eat(Food food) {
        switch (food){
            case MEAT:
                return reactToMeat;
            case FRUIT:
                return reactToFruit;
            case VEGETABLE:
                return reactToVegetable;
        }
        return 0;
    }
}
