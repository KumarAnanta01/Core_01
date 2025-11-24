package org.example.Loops;

import java.util.Scanner;

public class SC4 {

    public static void main(String[] args) {
        //Display Ap Series
     /*   Scanner s=new Scanner(System.in);

        System.out.println("Program to print AP Series");
        System.out.println("Enter a ,d and n");
        int a = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        int term=a;

        for(int i=0;i<n;i++) {
            System.out.print(term + ",");
            term = term + d;

        }*/

        //display GP Series
/*
        Scanner s=new Scanner(System.in);

        System.out.println("Program to print AP Series");
        System.out.println("Enter a ,r and n");
        int a = s.nextInt();
        int r = s.nextInt();
        int n = s.nextInt();
        int term=a;

        for(int i=0;i<n;i++) {
            System.out.print(term + ",");
            term = term*r;

        }*/

        //display fibonacci series
        Scanner s=new Scanner(System.in);

        System.out.println("Program to print Fibonacci Series");
        System.out.println("Enter the Number of Terms");

        int n=s.nextInt();

        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for (int i=0;i<n-2;i++){
             c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }


    }
}
