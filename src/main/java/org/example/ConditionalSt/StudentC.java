package org.example.ConditionalSt;

import java.util.Scanner;

public class StudentC {

    public static void main(String[] args) {
        // display name of domain extension

        Scanner Sc3 = new Scanner(System.in);
        String domain = Sc3.nextLine();
        String ext = domain.substring(domain.lastIndexOf("."));

        switch (ext) {
            case ".com":
                System.out.println("Commercial");
                break;

            case ".net":
                System.out.println("Network");
                break;

            case ".gov":
                System.out.println("Government");
                break;

            case ".org":
                System.out.println("Organisation");
                break;

            default:
                System.out.println("Unknown extension");
        }
    }
}

//last video is pending
