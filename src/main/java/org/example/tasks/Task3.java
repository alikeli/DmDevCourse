package org.example.tasks;

public class Task3 {

    public static void main(String[] args) {
        int rub = 112;
        int i = rub % 100;
        int i1 = rub % 10;
        if (i1 == 1 && i != 11) {
            System.out.println(rub + " рубль");
        } else if ((i1 == 2 || i1 == 3 || i1 == 4) &&
        !(i == 12 || i == 13 || i == 14 )) {
            System.out.println(rub + " рубля");
        } else {
            System.out.println(rub + " рублей");
        }
    }
}
