package org.example.Array1;

public class SC2 {

    public static void main(String[] args) {
        //coping an array
       /* int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }

        for(int x:B)
        {
            System.out.print(x+",");
        }*/

        //reverse copying an array
       /* int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];

        for(int i=A.length-1,j=0;i>=0;i++,j++)
        {
            B[j]=A[i];
        }

        for(int x:B)
        {
            System.out.println(x+",");
        }*/
//increase length of an array

        int A[]={8,6,10,9,2};

        System.out.println("Length of A="+A.length);

        int B[]=new int[10];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;

        System.out.println("Length of A="+A.length);

    }
}
