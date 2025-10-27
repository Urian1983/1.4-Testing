package level2;

import level2.model.AssertionsModel;

public class Ex7Main {
    public static void main(String[] args) {
        AssertionsModel a = new AssertionsModel();
        a.createEmptyOptional();
        System.out.println("Optional buit? " + a.isOptionalEmpty());
    }
}
