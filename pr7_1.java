package com.company;

public class pr7_1 {
    public static <E> void printArray(E[] inputArray) {
// Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArray = {'M', 'O', 'K', 'S', 'H'};
        System.out.println("Integer Array contains:");
        printArray(intArray);
        System.out.println("Double Array contains:");
        printArray(doubleArray);
        System.out.println("Character Array contains:");
        printArray(charArray);
        System.out.println("This program is prepared by 21CE099_Moksh:)");
    }

}
