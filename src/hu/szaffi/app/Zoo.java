package hu.szaffi.app;

import hu.szaffi.app.animal.*;

import java.util.ArrayList;
import java.util.List;

class Zoo {

    private List<Animal> animals = new ArrayList<>();

    void initAnimals() {
        Rabbit rabbit = new Rabbit("Nyuszo", 2);
        animals.add(rabbit);
        Hedgehog hedgehog = new Hedgehog("Sunike", 2);
        animals.add(hedgehog);
        Bear bear = new Bear("MaciLaci", 4);
        animals.add(bear);
        Wolf wolf = new Wolf("Logan", 3);
        animals.add(wolf);
    }

    void simulateADay(){
        Food randomFood = Food.getRandomFood();
        System.out.println(randomFood);
        for (Animal animal :
                animals) {
            animal.eat(randomFood);
            animal.printData();
        }
    }

}
