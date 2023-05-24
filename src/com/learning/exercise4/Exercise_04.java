package com.learning.exercise4;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double conversion;

        System.out.println("Type the temperature in celsius");
        celsius = input.nextDouble();
        conversion = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " celsius is equal to " + conversion + " fahrenheit");
    }

    public static double celsiusToFahrenheit(double celsius){
        double result;

        //Conversion formula
        result = 32 + ((9*celsius)/5);
        return result;

    }
}
