package com.company;

import java.util.Scanner;

/**
 * סדנה 11
 * Q4 - solution
 * DO NOT FORGET - ENABLE AUTO IMPORT
 */
public class Q4{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of students registered to the summer camp");
        int stud = scanner.nextInt();
        int counselor = stud/10;
        if(stud%10!=0){
            counselor++;
            System.out.print(counselor);
        }else{
            System.out.print(counselor);
        }
    }
}
