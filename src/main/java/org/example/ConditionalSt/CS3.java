package org.example.ConditionalSt;

import java.util.Scanner;

public class CS3 {

    public static void main(String[] args) {
        // display of a day based on the number

        Scanner sc2= new Scanner(System.in);

        System.out.println("Enter a number");

        int day=sc2.nextInt();


        if (day==1)
        {
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");

        }else if (day==3) {
            System.out.println("Wednesday");

        }else if (day==4) {
            System.out.println("Thursday");

        }else if (day==5) {
            System.out.println("FriDay");

        }else if (day==6) {
            System.out.println("Saturday");

        }else if (day==7) {
            System.out.println("Sunday");

        }else {
            System.out.println("Invalid day number");
        }


    }
}
