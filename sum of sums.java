package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ArrayList<Integer> digits = (digits(input));
        while (digits.size() > 1) {
            int sum = 0;
            for (int digit : digits) {
                sum += digit;
            }
            digits = digits(sum);
        }
        System.out.println(digits);
    }

    public static ArrayList<Integer> digits(int i) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        return digits;
    }

}
