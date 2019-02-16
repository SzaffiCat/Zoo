package hu.szaffi.app.animal;

public class Hedgehog extends Animal {
    public Hedgehog(String name, int weight) {
        super(name, weight);
        this.overWeight = 5;
        this.reactToFruit = 2;
        this.reactToVegetable = 0;
        this.reactToMeat = -1;
    }

}
