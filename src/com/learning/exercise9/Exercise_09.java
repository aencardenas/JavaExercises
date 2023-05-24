package com.learning.exercise9;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String phrase;
        String firstLetter;

        System.out.println("Type a phrase: ");
        phrase = input.nextLine();

        firstLetter = phrase.substring(0,1);

        if(firstLetter.equals("A")){
            System.out.println("Correct");
        }else{

            System.out.println("Incorrect");
        }
    }
}
