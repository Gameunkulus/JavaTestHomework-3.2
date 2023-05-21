package com.company;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weigth = 98;
        int bmi = service.calculate(height, weigth);
        System.out.println(bmi);
    }
}
