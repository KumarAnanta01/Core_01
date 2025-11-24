package org.example.Loops;

public class NL1 {
    public static void main(String[] args) {

        // nested for loop
     /*   for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=7;j++) {

                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println(" ");
        }*/

        //pattern
int count=0;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){

                count ++;
               // System.out.print(count+" ");
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }


    }
}
