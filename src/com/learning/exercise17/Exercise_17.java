package com.learning.exercise17;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        System.out.println("Digite el tamano del vector: ");
        N = Integer.parseInt(input.nextLine());
        String[] array = new String[N];
        int max = 99999;
        int min = 0;
        int lenght;

        for (int i = 0; i < N ; i++) {
            array[i] = Integer.toString((int)Math.floor(Math.random() * (max - min + 1) + min));
            lenght = array[i].length();

            switch (lenght){
                case 1:
                    unDigito +=1;
                    break;

                case 2:
                    dosDigitos += 1;
                    break;

                case 3:
                    tresDigitos += 1;
                    break;
                case 4:
                    cuatroDigitos += 1;
                    break;

                case 5:
                    cincoDigitos += 1;
                    break;

                default:
                    break;
            }

        }

        System.out.println("Un digito: " + unDigito);
        System.out.println("Dos digitos: " + dosDigitos);
        System.out.println("Tres digitos: " + tresDigitos);
        System.out.println("Cuatro digitos: " + cuatroDigitos);
        System.out.println("Cinco digitos: " + cincoDigitos);


    }
}
