package org.example.tasks;

/**
 * write a program witch print array in positive and negative order
 */
public class Task {
    public static void main( String[] args) {
        int[] values = {0, 1, 25, 36, 99, 12};
        printArray(values);
        printArrayForEach(values);
        printArrayNegativeOrder(values);
    }

    public static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayForEach(int[] values) {
        for (int value : values) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    public static void printArrayNegativeOrder(int[] values) {
        for (int i = values.length-1; i >= 0; i--) {
            System.out.println(values[i] + " ");
        }
        System.out.println();
    }

}
