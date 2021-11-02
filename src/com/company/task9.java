package com.company;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed, differnce = 0;
        System.out.println("enter the speed");
        speed = input.nextInt();
        if (speed<90)
            System.out.println("speed is allowed");
        if (speed>90)
            differnce= speed-90;
            System.out.println("you will have to pay a bill");
            if (differnce>6)
                System.out.println("you will have to be at the course");
    }
}
