package com.learning.exercise14;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cantidad;
        String divisa;

        System.out.println("Ingresa la cantidad de euros: ");
        cantidad = Integer.parseInt(input.nextLine());

        System.out.println("Ingresa la divisa (dolares, yenes, libras): ");
        divisa = input.nextLine();

        convertirDivisas(cantidad, divisa);
        
    }

    public static void convertirDivisas(int cantidad, String divisas){

        if(divisas.equalsIgnoreCase("dolares")){


            System.out.println(cantidad + " euros equivalen a " + (1.2811 * cantidad) + " dolares");

        } else if (divisas.equalsIgnoreCase("yenes")) {

            System.out.println(cantidad + " euros equivalen a " + (129.852 * cantidad) + " yenes");


        }else {

            System.out.println(cantidad + " euros equivalen a " + (0.86 * cantidad) + " libras");
        }
    }
}
