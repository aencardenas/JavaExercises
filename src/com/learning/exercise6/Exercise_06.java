package com.learning.exercise6;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Type an integer number: ");
        number = input.nextInt();

        if(number % 2 == 0){

            System.out.println(number + " is an even number");

        }else{
            System.out.println(number + " is an odd number");
        }
    }
}
