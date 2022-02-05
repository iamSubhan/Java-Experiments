package com.softUni;

import java.util.Scanner;

public class Main {

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (operation.equals("add")) {
            add(a,b);
        } else if (operation.equals("subtract")) {
            subtract(a,b);
        } else if (operation.equals("multiply")) {
            multiply(a,b);
        } else if (operation.equals("divide")) {
            divide(a,b);
        }
    }
}
