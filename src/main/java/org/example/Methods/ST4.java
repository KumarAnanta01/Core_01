package org.example.Methods;

public class ST4 {
    int [] reverse(int A[])
    {
        int B[]=new int[A.length];

        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];

        return B;
    }

    public static void main(String[] args) {

    }
}
