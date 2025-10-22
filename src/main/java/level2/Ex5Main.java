package level2;

import level2.model.Assertions;

public class Ex5Main {
    public static void main(String[] args) {
        Assertions a = new Assertions();
        a.fillMap();
        System.out.println("Has 'Age'? " + a.mapContainsKey("Age"));
        System.out.println("Has 'Weight'? " + a.mapContainsKey("Weight"));
    }
}
