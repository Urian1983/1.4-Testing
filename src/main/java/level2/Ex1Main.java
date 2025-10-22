package level2;

import level2.model.Assertions;

public class Ex1Main {
    public static void main(String[] args) {
        Assertions a = new Assertions();
        System.out.println("10 == 10 ? " + a.compareIntegers(10, 10));
        System.out.println("10 == 5 ? " + a.compareIntegers(10, 5));
    }
}
