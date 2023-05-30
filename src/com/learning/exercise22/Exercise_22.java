package com.learning.exercise22;

import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes;
        String dayAndHours;

        System.out.println("Type the number of minutes: ");
        minutes = Integer.parseInt(input.nextLine());
        dayAndHours = convertirMinutos(minutes);
        System.out.println(minutes + " minutes equivalen a: " + dayAndHours);



    }

    public static String convertirMinutos(int minutes){
        int diaEquivalenteEnMinutos = 1440;
        int minutosEquivalentesEnHoras = 60;
        String resultado = "";

        if(minutes > diaEquivalenteEnMinutos){

            resultado = String.valueOf(minutes/diaEquivalenteEnMinutos) + " dias, ";
            resultado = resultado + String.valueOf((minutes - diaEquivalenteEnMinutos)/minutosEquivalentesEnHoras) + " horas";
        } else{
            resultado = "0 dias, ";
            resultado = resultado + String.valueOf(minutes/minutosEquivalentesEnHoras) + " horas";
        }

        return resultado;

    }
}
