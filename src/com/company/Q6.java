package com.company;

import java.util.Scanner;
/**
 * סדנה 11
 * Q6 - solution
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount of people");
        int people = input.nextInt();
        int boats = people/8;
        if (people%8 != 0)
            boats++;
        System.out.println("amount of boats is "+boats +" and money will"+(people*30));
    }
}
