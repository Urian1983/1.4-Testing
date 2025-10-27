package level2;

import level2.model.AssertionsModel;

public class Ex2Main {
    public static void main(String[] args) {
        AssertionsModel a = new AssertionsModel();
        System.out.println("'Hello' == 'Hello' ? " + a.compareStrings("Hello", "Hello"));
        System.out.println("'Hello' == 'Bye' ? " + a.compareStrings("Hello", "Bye"));
    }

}
