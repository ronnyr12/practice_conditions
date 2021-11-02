package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q8 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int a = s.nextInt();
        int a1 = s1.nextInt();
        int a2 = s2.nextInt();
        int fin=(a+a1+a2)/3;
        if(fin>=100)System.out.println("Очень дождливый "+ fin);
        else System.out.println(fin);
    }



}
