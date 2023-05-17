package com.company;

public class Main {
    public static void main(String[] args) {
        calcClass service = new calcClass();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}
