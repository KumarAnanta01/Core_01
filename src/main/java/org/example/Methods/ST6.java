package org.example.Methods;

public class ST6 {

  /*  static void show(int ...A) {
        for (int x:A

        ) {
            System.out.println(x);
        }


    }

    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{3,5,7,9,11,13,15});
    }*/
static void showList(int start,String ...s)
{
    for (int i=0;i<s.length;i++)
    {
       // System.out.println(i+1+". "+s[i]);
        System.out.println(start+". "+s[i]);
        start++;
    }
}
    public static void main(String[] args) {

    showList(5,"jhon","smith","ajay","arun");

    }
}
