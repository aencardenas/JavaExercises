package com.learning.exercise25;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer,String> numbers = new HashMap<Integer,String>() {{

            put(1,"I");
            put(2,"II");
            put(3,"III");
            put(4,"IV");
            put(5,"V");
            put(6,"VI");
            put(7,"VII");
            put(8,"VII");
            put(9,"IX");
            put(10,"X");
        }};

        System.out.println("Type a decimal number between 1 to 10 to convert it to Roman numerals: ");
        System.out.println(numbers.get(input.nextInt()));


    }






}
