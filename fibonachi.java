package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  to limit the fibonachi ");
        int numUntil = sc.nextInt();
        ArrayList<Integer> fiboNum = new ArrayList<>();
        fiboNum.add(1);
        int i = 1;
        int number = 1;
        while (number < numUntil) {
            fiboNum.add(number);
            number = fiboNum.get(i - 1) + fiboNum.get(i);
            i++;
        }
        System.out.println(fiboNum.get(fiboNum.size() - 1));
    }
}
