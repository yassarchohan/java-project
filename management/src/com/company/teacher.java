package com.company;

import java.util.Scanner;

/**
 * Created by MT-2016 on 6/19/2016.
 */
public class teacher {
    public String name;
    public String qualification;
    public int age;
    public String course;


    Scanner sc = new Scanner(System.in);

    public void addteach() {
//        this.name = name;
//        this.age = age;
//        this.qualification = qualification;
//        this.course = course;

        System.out.println("enter teacher name");
        name = sc.next();
        System.out.println("enter qualification");
        qualification = sc.next();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter course");
        course = sc.next();

    }
}
