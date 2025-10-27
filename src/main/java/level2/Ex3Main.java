package level2;

import level2.model.AssertionsModel;

public class Ex3Main {
    public static void main(String[] args) {
        AssertionsModel a = new AssertionsModel();
        int[] arr = a.fillListIntegers(1, 2, 3, 4, 5);
        System.out.print("Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

}
