package com.company;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double howused,sum = 0, howusede = 0;
        System.out.println("enter how much used");
        howused = input.nextInt();
        if (howused<180)
            sum = howused*70;
        if (howused>180)
            sum= 180*70;
            howusede = howused-180;
            sum = sum+howusede*90;
            if (howused>1000)
                sum = sum+sum/100*10;
        sum = sum+sum/100*17;
        System.out.println("you will have to pay " + sum +" cents");
    }
}
