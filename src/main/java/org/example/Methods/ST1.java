package org.example.Methods;

public class ST1 {
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }

    //find a number is prime
    public static void main(String[] args) {

        System.out.println(isPrime(91));

    }
}
