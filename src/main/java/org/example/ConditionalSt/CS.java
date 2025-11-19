package org.example.ConditionalSt;

import java.util.Scanner;

public class CS {
//find radix of a number given in a string
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String  num;

        System.out.println("Enter a number");

        num = scan.nextLine();

        if (num.matches("[01]+"))
        {
            System.out.println("Binary Radix=2");
        }else if (num.matches("[0-8]+"))
        {
            System.out.println("Octal Radix=2");
        }else if (num.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix=2");
        }else if (num.matches("[0-9,A-F]+"))
        {
            System.out.println("HexaDecimal Radix=2");
        }else {
            System.out.println("its  not a number");
        }


    }
}
