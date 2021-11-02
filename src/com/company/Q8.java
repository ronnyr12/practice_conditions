package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q8 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Amount of precipitation in january: ");
        int jan = in.nextInt();
        System.out.println("Amount of precipitation in february: ");
        int feb = in.nextInt();
        System.out.println("Amount of precipitation in march: ");
        int mar = in.nextInt();

        double result = (double) (jan+feb+mar)/3;
        System.out.println("Average: " + result);

        if(result>100) System.out.println("These months were very rainy");
    }



}
