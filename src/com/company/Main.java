package com.company;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heigh = 1.87;
        double weigth = 98;
        int bmi = service.calculate(heigh,weigth);
        System.out.println(bmi);
    }
}
