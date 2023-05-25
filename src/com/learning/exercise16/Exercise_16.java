package com.learning.exercise16;

import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int numberToFind;

        System.out.println("Digite el tamano del vector");
        N = Integer.parseInt(input.nextLine());
        int[] array = new int[N];
        llenarVector(array,N);

        System.out.println("Digita el numero que quieres buscar: ");
        numberToFind = Integer.parseInt(input.nextLine());
        buscarNumero(array,numberToFind,N);



    }
    public static void llenarVector(int[] array, int N){
        int min = 0;
        int max = 15;

        for (int i = 0; i < N; i++) {
            array[i] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }

    }

    public static void buscarNumero(int[] array, int number,int N){
        int contadorRepeticion = 0;
        for (int i = 0; i < N ; i++) {
            if(array[i] == number){
                System.out.println("El numero esta en la posicion " + i);
                contadorRepeticion += 1;
            }
        }

        if(contadorRepeticion>1){
            System.out.println("El numero se encuentra repetido");
        }

        if(contadorRepeticion == 0){
            System.out.println("El numero no se encuentra");
        }
    }
}
