package org.example.ConditionalSt;

import java.util.Scanner;

public class CS2 {

    public static void main(String[] args) {
        // find if a given year is leap year or not

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = sc1.nextInt();

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }

            } else {
                System.out.println("It is a leap year");
            }

        } else {
            System.out.println("It is not a leap year");
        }

    }
}
