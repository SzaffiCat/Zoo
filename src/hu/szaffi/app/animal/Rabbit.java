package hu.szaffi.app.animal;

public class Rabbit extends Animal {
    public Rabbit(String name, int weight) {
        super(name, weight);
        this.overWeight = 4;
        this.reactToFruit = 1;
        this.reactToVegetable = 2;
        this.reactToMeat = -1;
    }

}
