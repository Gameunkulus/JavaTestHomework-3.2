package com.company;

public class BmiService {

    public static int calculate(double heigthM, double weigthKG) {
        double index = (weigthKG / (heigthM * heigthM));
        return (int) index;
    }

}
