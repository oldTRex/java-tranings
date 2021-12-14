package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] codes = scanner.nextLine().split(" ");
        String res = "";
        String[] hashTable = {"", "", "abc", "def", "ghi", "jkl",
                "mno", "pqr", "stu", "vwx", "yz"};

        for (String code : codes) {
            int firstNumber =Integer.parseInt(String.valueOf(code.charAt(0)));
            res = res.concat(String.valueOf((hashTable[firstNumber].charAt(code.length() - 1))));
        }
        System.out.println(res);
    }


}
