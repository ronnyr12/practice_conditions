package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q6 - solution
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many people need a boat: ");
        int people = in.nextInt();

        double result = (double) people / 8;

        if (result != (int) result) result += 1;
        System.out.println((int) result);

    }
}
