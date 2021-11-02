package com.company;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many times did he visit club");
        int times = input.nextInt();
        if (times<4)
            System.out.println("not enough");
        else if (times>7)
            System.out.println("overdone");
        else
            System.out.println("kk");
    }
}
