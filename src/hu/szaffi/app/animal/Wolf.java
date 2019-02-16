package hu.szaffi.app.animal;

public class Wolf extends Animal {
    public Wolf(String name, int weight) {
        super(name, weight);
        this.overWeight = 6;
        this.reactToFruit = -1;
        this.reactToVegetable = -1;
        this.reactToMeat = 3;
    }


}
