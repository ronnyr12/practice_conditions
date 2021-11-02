package com.company;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        if(num>9)
            if(num<100)
                System.out.println("two digits");
            else
                System.out.println("more then two digits");
        else
            System.out.println("only one digit");
    }
}
