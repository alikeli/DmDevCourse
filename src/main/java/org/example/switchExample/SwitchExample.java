package org.example.switchExample;

public class SwitchExample {
    public static void main(String[] args) {


        int value = 2;
        switch (value) {
            case 1:
                System.out.println("first");
                break;
            case 2:
                System.out.println("second");
                break;
            case 30:
                System.out.println("thirtieth");
                break;
            default:
                System.out.println("number not found");
        }


        int value1 = 2;
        switch (value1) {
            case 11, 22, 33 -> {
                System.out.println("show numbers");
            }
            default -> System.out.println("number not found");
        }
    }
}
