package hu.szaffi.app.animal;

import hu.szaffi.app.Food;

public abstract class Animal {
    private String name;
    private int weight;
    int overWeight;
    int reactToMeat;
    int reactToVegetable;
    int reactToFruit;

    Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    private int reactToFood(Food food) {
        switch (food) {
            case MEAT:
                return reactToMeat;
            case FRUIT:
                return reactToFruit;
            case VEGETABLE:
                return reactToVegetable;
        }
        return 0;
    }

    public void eat(Food food) {
        int change = reactToFood(food);
        this.weight += change;
    }

    private boolean isAlive() {
        return (0 < weight && weight <= overWeight);
    }

    public void printData() {
        System.out.println(getClass().getSimpleName() + " / " + name + ": ");
        if (isAlive()) {
            System.out.println("Weight: " + weight);
        } else {
            System.out.println("Dead :(");
        }
    }
}
