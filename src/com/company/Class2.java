package com.company;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        //even or odd number
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num % 2 != 0)
            System.out.println("odd value");
        else
            System.out.println("even value");
    }
}

