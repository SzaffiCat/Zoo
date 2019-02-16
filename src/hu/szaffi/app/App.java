package hu.szaffi.app;

public class App {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        int oneWeek = 7;
        zoo.initAnimals();
        for (int day = 0; day < oneWeek; day++) {
            zoo.simulateADay();
        }
    }
}
