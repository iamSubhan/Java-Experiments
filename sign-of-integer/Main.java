package com.softUni;

import java.util.Scanner;

public class Main {

    public static void checkNum(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.",num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.",num);
        } else {
            System.out.printf("The number %d is zero.",num);
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        checkNum(Integer.parseInt(scanner.nextLine()));
    }
}
