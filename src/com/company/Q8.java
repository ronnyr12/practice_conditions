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
        System.out.println("Please enter the amount of precipitation that has fallen in January");
        double j= scanner.nextDouble();
        System.out.println("Please enter the amount of precipitation that has fallen in February");
        double f= scanner.nextDouble();
        System.out.println("Please enter the amount of precipitation that has fallen in March");
        double m= scanner.nextDouble();
        double avr=(m+j+f)/3;
        System.out.println("The amount of precipitation that has fallen in 3 months is: "+avr);
        if(avr>100)
            System.out.println("Very rainy"+"\n:)");
    }



}
