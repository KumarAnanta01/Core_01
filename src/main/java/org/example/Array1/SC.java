package org.example.Array1;

import java.util.Scanner;

public class SC {
    public static void main(String[] args) {
        //finding sum of all the elements
        // int A[]={3,9,7,8,12,6,15,5,4,10};

        //int sum=0;
  /*      for (int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println("Sum is "+sum);*/
    /*    for (int x:A)// integer x from A
        {
            sum=sum+x;
        }
        System.out.println("Sum is "+sum);*/

        // Searching an element in array
/*
        Scanner sc = new Scanner(System.in);
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int key;

        System.out.println("Enter a key");
        key = sc.nextInt();

        for(int i=0;i<A.length;i++)
        {
            if(key==A[i]){
                System.out.println("Element found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("not found");*/

        //finding maximum Element in array
/*
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max=A[0];
        for (int i=0;i<A.length;i++)
        {
            if(A[i]>max){
               max=A[i];
            }
        }
        System.out.println("maximum elements is "+max);*/

        //find 2nd largest element is an array
        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max1,max2;
        max1=max2=A[0];

        for (int i=0;i<A.length;i++){
            if(A[i]>max1){
                max1=A[i];
            }
            else {
                if(A[i]>max2)
                {
                    max2=A[i];
                }
            }
        }
        System.out.println("second largest element is :"+max2);

    }
}
