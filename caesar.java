package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\ncaesar algorithm implementation : enter the number\t");
        int number = scanner.nextInt();
        System.out.println("\nenter the word to encode : ");
        String word = scanner.next();
        String buffer = caesarEncode(word, number);
        System.out.println(buffer);
    }

    public static String caesarEncode(String word, int n) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                char ch = (char) (((int) word.charAt(i) +
                        n - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) word.charAt(i) +
                        n - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
