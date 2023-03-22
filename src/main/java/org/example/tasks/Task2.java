package org.example.tasks;

/**
 * Определить, является ли последняя цифра = 3
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 225563;
        int test = value%10;


        if ( test == 3){
            System.out.println("number = " + test);
        } else System.out.println("number not equals 3");

    }
}
