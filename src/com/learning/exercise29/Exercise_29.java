package com.learning.exercise29;

import java.util.Scanner;

public class Exercise_29 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int number;

        System.out.println("Type numbers: ");

        do{

            number = input.nextInt();

            if (number % 5 != 0 && number > 0) {
                counter += 1;
                if (number % 2 == 0){
                    evenNumbers += 1;
                } else {
                    oddNumbers += 1;
                }
            } else if (number % 5 == 0 && number > 0) {
                break;
            } else{


            }
        }while(true);


        System.out.println("The total number of inputs is: " + counter);
        System.out.println("The total number of even numbers entered are: " + evenNumbers);
        System.out.println("The total number of odd numbers entered are: " + oddNumbers);
        
    }
}
