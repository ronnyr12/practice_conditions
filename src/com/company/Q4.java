package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q4 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount of people");
        int people = input.nextInt();
        int left = people%10;
        int guide = people/10;
        if (left != 0)
            guide++;
        System.out.println("you will need "+guide);
    }
}
