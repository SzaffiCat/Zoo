package hu.szaffi.app.animal;

public class Bear extends Animal {
    public Bear(String name, int weight) {
        super(name, weight);
        this.overWeight = 10;
        this.reactToFruit = 1;
        this.reactToVegetable = -1;
        this.reactToMeat = 1;
    }

}
