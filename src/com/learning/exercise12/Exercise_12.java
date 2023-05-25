package com.learning.exercise12;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String string;
        boolean startString;
        boolean endString;
        int lenghtString;
        int validString;
        int invalidString;

        validString = 0;
        invalidString = 0;

        System.out.println("Ingresa las cadenas con el formato especificado: ");

        do {
            string = input.nextLine();
            startString = string.startsWith("X");
            endString = string.endsWith("O");
            lenghtString = string.substring(1,string.length()-1).length();


            if((lenghtString == 5) && startString && endString){
               if(string.substring(1,string.length()-1).equals("&&&&&")){
                   break;
               }
               validString += 1;

            }else{
                invalidString += 1;
            }
        }while(true);

        System.out.println("Lecturas correctas: " + validString);
        System.out.println("Lecturas incorrectas: " + invalidString);
    }
}
