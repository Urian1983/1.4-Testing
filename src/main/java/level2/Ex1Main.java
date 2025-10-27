package level2;

import level2.model.AssertionsModel;

public class Ex1Main {
    public static void main(String[] args) {
        AssertionsModel a = new AssertionsModel();
        System.out.println("10 == 10 ? " + a.compareIntegers(10, 10));
        System.out.println("10 == 5 ? " + a.compareIntegers(10, 5));
    }
}
