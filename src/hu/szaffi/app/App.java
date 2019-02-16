package hu.szaffi.app;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.initAnimals();
        for (int day = 0; day < 7; day++) {
            zoo.simulateADay();
        }
    }
}
