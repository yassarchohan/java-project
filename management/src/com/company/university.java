package com.company;

import java.util.Scanner;

/**
 * Created by MT-2016 on 6/19/2016.
 */
public class university {

    int select;
    Scanner sc = new Scanner(System.in);
    teacher t = new teacher();
    teacher[] arr = new teacher[10];


    public void task() {
        select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("too add teacher");
                t.addteach();
                break;
            case 2:
                System.out.println("to check list");
                view();
                break;
            case 3:
                System.out.println("to fetch for particular teacher");
                fetch();
                break;

            case 4:
                System.out.println("exit");
                System.exit(0);

        }
    }


    public void view() {
        int index = 0;
        arr[index++] = t;
        System.out.print("name" + "\t" + "qualification" + "\t" + "age" + "\t\t" + "course");
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name + "\t" + arr[i].qualification + "\t" + "\t\t" + arr[i].age + "\t\t" + arr[i].course);
            break;
        }
    }

    public void fetch(){
        System.out.println("please the name of teacher to search");
        String input;

        input = sc.next();

            for(int i = 0 ; i < 1 ; i++){
            if(input.equals(arr[i].name) && arr[i] != null )
            {
                System.out.println("this is present in university"+input);
            }
            else {
                System.out.println("this teacher is not in the university");
            }

            break;

        }
    }
}
