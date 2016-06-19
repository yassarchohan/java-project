package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        university un = new university();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the university management system ");

        System.out.println("please select the task below");
        System.out.println("1.to add new teacher");
        System.out.println("2.to view teacher list");
        System.out.println("3.to search for particular teacher");
        System.out.println("To exit the application");
        while (true) {
            un.task();

        }

    }
}
