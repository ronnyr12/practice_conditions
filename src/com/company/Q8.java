package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q8 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt()+scanner.nextInt()+scanner.nextInt() > 100) {
            System.out.println(">100");
        }
        else {
            System.out.println("<100");
        }
    }



}
