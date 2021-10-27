package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year to check:");
        int year = scanner.nextInt();

        //check if year is a leap year
        if((year % 4 == 0))
            System.out.println("this is a leap year\n29 days in feb");
        else
            System.out.println("regular year, 28 days");
    }
}
