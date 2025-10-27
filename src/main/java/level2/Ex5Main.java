package level2;

import level2.model.AssertionsModel;

public class Ex5Main {
    public static void main(String[] args) {
        AssertionsModel a = new AssertionsModel();
        a.fillMap();
        System.out.println("Has 'Age'? " + a.mapContainsKey("Age"));
        System.out.println("Has 'Weight'? " + a.mapContainsKey("Weight"));
    }
}
