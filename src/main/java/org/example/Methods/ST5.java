package org.example.Methods;

public class ST5 {
    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }


    boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {

    }
}
