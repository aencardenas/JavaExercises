package com.learning.exercise8;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String phrase;

        System.out.println("Type a phrase: ");
        phrase = input.nextLine();

        if(phrase.length() == 8){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }

    }
}
