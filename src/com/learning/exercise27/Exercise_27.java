package com.learning.exercise27;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadDeAlturas;
        float sumaAlturasMenores = 0f;
        float sumaAlturas = 0f;
        int contAlturasMenores = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");


        System.out.println("Ingresa el numero de personas para registrar su altura:");
        cantidadDeAlturas = Integer.parseInt(input.nextLine());

        float[] alturas = new float[cantidadDeAlturas];

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Ingrese la altura " + (i+1));
            alturas[i] = Float.parseFloat(input.nextLine());

            if(alturas[i] < 1.60){

                sumaAlturasMenores = sumaAlturasMenores + alturas[i];
                contAlturasMenores += 1;
            }

            sumaAlturas = sumaAlturas + alturas[i];
        }

        System.out.println("Promedio de alturas por debajo de 1.60: " + decimalFormat.format(sumaAlturasMenores/contAlturasMenores));
        System.out.println("Promedio de alturas general: " + decimalFormat.format(sumaAlturas/alturas.length));
    }
}
