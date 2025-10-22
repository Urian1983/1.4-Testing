package level2;

import level2.model.Assertions;

public class Ex4Main {
    public static void main(String[] args) {
        Assertions a = new Assertions();
        a.fillObjectList('A', 123, "Hello");
        System.out.println("List: " + a.getObjectList());
        a.addToObjectList('A');
        System.out.println("Duplicated 'A'? " + a.checkDuplicates('A'));
    }
}
