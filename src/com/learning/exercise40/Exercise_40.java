package com.learning.exercise40;
import java.util.Scanner;

public class Exercise_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the fibonnaci's sequence term: ");
        int[] fibonnaciSerie = new int[input.nextInt()];
        int fibonnaci = 1;
        int fibonacciX = 1;
        int fibonacciY = 0;

        for (int i = 0; i < fibonnaciSerie.length; i++) {

            fibonnaci = fibonacciX + fibonacciY;
            fibonacciY = fibonacciX;
            fibonacciX = fibonnaci;

            if(fibonnaci <= 1 && i == 0){
                fibonnaciSerie[i] = 1;
                fibonacciY = 0;
            } else {
                fibonnaciSerie[i] = fibonnaci;
            }

            System.out.print(fibonnaciSerie[i] + " ");

        }


    }
}
