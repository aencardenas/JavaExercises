package com.learning.exercise3;

import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase;

        System.out.println("Type a phrase: ");
        phrase = input.nextLine();

        System.out.println("In upper case: " + phrase.toUpperCase());
        System.out.println("In lower case: " + phrase.toLowerCase());
    }

}
