package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");

        System.out.println((Integer.parseInt(numbers[0]) ^ 2 + Integer.parseInt(numbers[1]) ^ 2) == (Integer.parseInt(numbers[2]) ^ 2));
    }
}
