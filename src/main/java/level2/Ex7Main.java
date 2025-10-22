package level2;

import level2.model.Assertions;

public class Ex7Main {
    public static void main(String[] args) {
        Assertions a = new Assertions();
        a.createEmptyOptional();
        System.out.println("Optional buit? " + a.isOptionalEmpty());
    }
}
