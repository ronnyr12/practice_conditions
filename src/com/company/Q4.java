package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q4 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of students registered to the summer camp: ");
        int kids = in.nextInt();

        double result = (double) kids / 10;
        if (result != (int) result) result += 1;
        System.out.println((int) result);
    }
}
