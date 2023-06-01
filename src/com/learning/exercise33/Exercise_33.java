package com.learning.exercise33;

import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String combination = getCombination(i, j, k);
                    System.out.println(combination);
                }
            }
        }
    }

    public static String getCombination(int i, int j, int k) {
        String digit1 = (i == 3) ? "E" : String.valueOf(i);
        String digit2 = (j == 3) ? "E" : String.valueOf(j);
        String digit3 = (k == 3) ? "E" : String.valueOf(k);

        return digit1 + "-" + digit2 + "-" + digit3;
    }

}
