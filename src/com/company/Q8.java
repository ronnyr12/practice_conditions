package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q8 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount in january");
        int jan = input.nextInt();
        System.out.println("enter amount in february");
        int feb = input.nextInt();
        System.out.println("enter amount in march");
        int mar = input.nextInt();
        double av = (double)(mar+feb+jan)/3;
        System.out.println("avarage is "+av);
        if (av>100)
            System.out.println("it is really rainy rn");
    }



}
