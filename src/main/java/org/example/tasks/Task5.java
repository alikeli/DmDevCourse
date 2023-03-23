package org.example.tasks;

/**
 * Write a program that fills an array with 100 int num. and this nums are divided  13 and 17
 */
public class Task5 {
    public static void main(String[] args) {
        int[] value = new int[100];
        fillArray(value);
        Task.printArray(value);

    }

    public static void fillArray(int[] values) {
        int count = 0;
        for (int i = 1; count < values.length; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                values[count]=i;
                count++;
            }

        }
    }
}
