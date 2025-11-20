package org.example.Loops;

import java.util.Scanner;

public class SC1 {

    public static void main(String[] args) {


// display multiplication table for a number

      /*  Scanner sc1=new Scanner(System.in);

        System.out.println("Enter a number");

        int n=sc1.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }*/
// find the sum of natural numbers
      /*  Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = sc1.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + i;

        }
        System.out.println("Sum of " + n + "Number is " + sum);*/

        // find factorial of a number
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = sc1.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {


            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
    }
}
