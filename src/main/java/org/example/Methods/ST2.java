package org.example.Methods;

public class ST2 {

    //find a number is prime


        int gcd(int m,int n)
        {
            while(m!=n)
            {
                if(m>n)m=m-n;
                else n=n-m;
            }
            return m;
        }

        public static void main(String[] args)
        {
            ST2 x=new ST2();
            System.out.println(x.gcd(35,56));




        }

}
