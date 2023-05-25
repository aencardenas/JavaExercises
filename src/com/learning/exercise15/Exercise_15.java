package com.learning.exercise15;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        fillArray(array);
        printArray(array);

    }

    public static void fillArray(int[] array){

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

    }

    public static void printArray(int[] array){

        for (int i = 99; i >= 0 ; i--) {

            System.out.print(array[i] + " ");

        }
    }
}
