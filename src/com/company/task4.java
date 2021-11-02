package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter amount of students");
        int students = input.nextInt();
        if (students>=15)
            System.out.println("class will be open with " +students + " students");
        else
            System.out.println("class wont be open, not enought students. " + students +" sitdents wont have classes");
    }
}
