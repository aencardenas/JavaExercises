package com.learning.exercise10;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit;
        int numbers;
        int sum;
        sum = 0;

        System.out.println("Type a positive limit: ");
        limit = input.nextInt();

        while(sum<=limit){

            System.out.println("Type a number: ");
            numbers = input.nextInt();
            sum += numbers;

        }

        System.out.println("You've passed the limit");

    }
}
