package com.company;

import java.util.Scanner;
/**
 * סדנה 11
 * Q6 - solution
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        if (Double.valueOf(people) / 8 != people) {
            System.out.println(people/8*30 + 30);
        }
        else {
            System.out.println(people/8*30);
        }

    }
}
