package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q4 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of students:");
        int s= scanner.nextInt();
        int m=s/10;
        if(s%10==0)
            System.out.println("The camp will need "+m+" madrihim");
        else
            System.out.println("The camp will need "+(m+1)+" madrihim");
        //complete missing code


    }
}
