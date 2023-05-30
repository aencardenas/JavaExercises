package com.learning.exercise26;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char tipoDeSocio;
        int costoDelTratamiento;
        boolean logic = false;
        float result;

        System.out.println("Ingresa el tipo de socio (A,B,C): ");

        do{
            tipoDeSocio = input.nextLine().charAt(0);

            if(tipoDeSocio == 'A' || tipoDeSocio == 'B' || tipoDeSocio == 'C' ){
                logic = true;
            } else{

                System.out.println("Ingrese un tipo de socio valido (A,B,C)");
            }

        }while(!logic);

        System.out.println("Ingresa el costo del tratamiento: ");
        costoDelTratamiento = Integer.parseInt(input.nextLine());
        System.out.println("El importe a pagar por ser socio tipo " + tipoDeSocio + " es: " + importeAPagar(tipoDeSocio,costoDelTratamiento));

    }
    public static float importeAPagar(char tipoDeSocio, int costoDelTratamiento){
        float costoConDescuento = 0f;

        switch (tipoDeSocio){

            case 'A':
                costoConDescuento = costoDelTratamiento * 0.5f;
                break;

            case 'B':
                costoConDescuento = costoDelTratamiento * 0.65f;
                break;

            case 'C':
                costoConDescuento = costoDelTratamiento;
                break;
        }

        return costoConDescuento;
    }
}
