package com.company;

import java.util.Scanner;
/**
 * סדנה 11
 * Q6 - solution
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of people:");
        int p= scanner.nextInt();
        int b=p/8;
        if(p%8==0)
            System.out.println("The amount of the boats is "+b+"\nThe price is: "+(30*b));
        else
            System.out.println("The amount of the boats is "+(b+1)+"\nThe price is: "+(30*(b+1)));
        //complete missing code

    }
}
