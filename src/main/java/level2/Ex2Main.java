package level2;

import level2.model.Assertions;

public class Ex2Main {
    public static void main(String[] args) {
        Assertions a = new Assertions();
        System.out.println("'Hello' == 'Hello' ? " + a.compareStrings("Hello", "Hello"));
        System.out.println("'Hello' == 'Bye' ? " + a.compareStrings("Hello", "Bye"));
    }

}
