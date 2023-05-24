package com.learning.exercise13;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = 6;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                if((i == 0 || i == length-1) || (j == 0 || j == length-1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }

            System.out.print("\n");
            
        }
    }
}
