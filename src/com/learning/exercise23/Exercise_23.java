package com.learning.exercise23;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B,C,D;
        int aux = 0;

        A = 5;
        B = 10;
        C = 15;
        D = 20;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);
        System.out.println("Valor de D: " + D);

        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;

        System.out.print("\n");
        System.out.println("Valor nuevo de A: " + A);
        System.out.println("Valor nuevo de B: " + B);
        System.out.println("Valor nuevo de C: " + C);
        System.out.println("Valor nuevo de D: " + D);




    }
}
