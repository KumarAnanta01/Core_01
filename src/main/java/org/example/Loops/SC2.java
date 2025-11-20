package org.example.Loops;

import java.util.Scanner;

public class SC2 {

    public static void main(String[] args) {

        // display digits of a number

      /*  Scanner s1= new Scanner(System.in);


        System.out.println("Enter a number");
        int n=s1.nextInt();

        int r;

        while (n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
        System.out.println(n);*/
//count digits of a number
       /* Scanner s1= new Scanner(System.in);


        System.out.println("Enter a number");
        int n=s1.nextInt();

        int count=0;

        while (n>0) {

            n = n / 10;
            count++;
          //  System.out.println();
        }
        System.out.println(count);*/

        //find a number is armstrong or not//153
     /*   Scanner s2 = new Scanner(System.in);
        System.out.println("enter a number");
        int x = s2.nextInt();


        int m = x;
        int sum = 0;
        int r;
        while (x > 0) {

            r = x % 10;
            x = x / 10;

            sum = sum + r * r * r;

        }
        if (sum == m)
            System.out.println("its an armstrong number");

        else
            System.out.println("its  not an armstrong number");*/

        //reverse a number
/*
        Scanner s4=new Scanner(System.in);

        System.out.println("enter a number ");
        int n=s4.nextInt();
        int rev=0,r;

        while (n>0)
        {
            r=n%10;
            rev=rev*10*+r;
            n/=10;

        }

        System.out.println("Reverse a Number "+rev);*/

        //check the number is palindrome or not

        Scanner s4=new Scanner(System.in);

        System.out.println("enter a number ");
        int n=s4.nextInt();

        int m=n;
        int rev=0,r;

        while (n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;

        }
        if(rev==m)

        System.out.println("it is a palindrome ");

        else
            System.out.println("it is not a palindrome ");




    }
}
