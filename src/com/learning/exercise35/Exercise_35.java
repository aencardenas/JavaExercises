package com.learning.exercise35;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Type the number of families: ");
        int numberOfFamilies = input.nextInt();

        int totalChildren = 0;
        int totalAge = 0;


        for (int i = 1; i <= numberOfFamilies ; i++) {
            System.out.println("Type the number of children for family " + i + ":");
            int numberOfChildren = input.nextInt();

            for (int j = 1; j <= numberOfChildren ; j++) {
                System.out.println("Enter the age of child " + j + ":");
                int childrenAge = input.nextInt();

                totalChildren++;
                totalAge += childrenAge;

            }
        }

        System.out.println("The total children average age is: " + decimalFormat.format(totalAge/totalChildren));



    }
}
