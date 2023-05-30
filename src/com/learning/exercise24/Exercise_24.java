package com.learning.exercise24;

import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letter;
        boolean vowel;

        System.out.println("Type a letter: ");
        letter = input.nextLine();

        vowel = (letter.equalsIgnoreCase("A")) || (letter.equalsIgnoreCase("E"))
                || (letter.equalsIgnoreCase("I")) || (letter.equalsIgnoreCase("O"))
                || (letter.equalsIgnoreCase("U"));

        System.out.println(vowel ? "It's a vowel":"Isn't a vowel");
    }



}
