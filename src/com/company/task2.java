package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter hours");
        int hours = input.nextInt();
        int test = 30-hours;
        if (test<=0)
            System.out.println("he passes");
        else
            System.out.println("he doesnt pass");
            System.out.println("he needs additional " + -test + " hours");
    }
}
