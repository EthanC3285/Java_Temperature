package com.company;

public class Converters {
    //C to F is (0°C × 9/5) + 32
    //Method to convert F to C
    public static double convertFtoC(double temp) {
        return ((temp - 32) * 5/9);
    }
    public static double convertCtoF(double temp){
        return ((temp * 9/5) + 32);
        //(tempAsF - 32) * 5/9
    }
}
