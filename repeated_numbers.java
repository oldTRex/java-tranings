package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the  numbers : ");
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.next().split("");
        Hashtable<Integer, Integer> dict = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            int count = repeatedCountNumber(i, numbers);
            if (count > 0) {
                dict.put(i, count);
            }
        }

        System.out.println(dict);
    }

    public static Integer repeatedCountNumber(int i, String[] numbers) {
        int counter = 0;
        for (String number : numbers) {
            if (Integer.parseInt(number) == i) counter++;
        }
        return counter;
    }
}
