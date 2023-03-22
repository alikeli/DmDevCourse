package org.example.if_else;

public class Lesson4 {
    public static void main(String[] args) {
        int value = 0;
        boolean test = value > 0;

        if (test) {
            System.out.println("number is positive");
        } else if (value == 0) {
            System.out.println("number = 0");
        } else {
            System.out.println("number is negative");
        }
    }
}
