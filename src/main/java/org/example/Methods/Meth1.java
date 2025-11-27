package org.example.Methods;

public class Meth1 {

   /* //static int max(int a,int b)
     int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        int x=10,y=20;
       // System.out.println(max(x,y));

        Meth1 m1=new Meth1();
        System.out.println(m1.max(x,y));

*/
   //static int max(int a,int b)

    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {

        int x=10,y=20;

        inc (x);
        // System.out.println(max(x,y));
        System.out.println(x);


    }
}
