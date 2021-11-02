package com.company;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter 3 sides");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a+b>c || a+c>b || b+c>a)
            System.out.println("you cant!!!!");
        else
            System.out.println("you can");
    }
}
