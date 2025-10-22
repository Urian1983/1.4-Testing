package level2;

import level2.model.Assertions;

public class Ex3Main {
    public static void main(String[] args) {
        Assertions a = new Assertions();
        int[] arr = a.fillListIntegers(1, 2, 3, 4, 5);
        System.out.print("Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

}
