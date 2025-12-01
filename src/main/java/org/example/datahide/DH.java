package org.example.datahide;
class Rectangle
{


    private double length;
    private double breadth;


    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l) {

        if (l>=0)
        length = l;
        else
            length=0;
    }

    public void setBreadth(double b) {
        if(b>=0)
        breadth = b;
        else
            breadth=0;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length*breadth);
    }
    public boolean isSqure(){
        if (length==breadth)
            return true;
        else
            return false;
    }
}
public class DH {

    public static void main(String[] args) {
        Rectangle re=new Rectangle();
        re.setLength(-10.5);
        re.setBreadth(5.5);

        System.out.println("Area is "+re.area());
        System.out.println("Perimeter is "+re.perimeter());
        System.out.println("it is a square "+re.isSqure());

        System.out.println("Length is "+re.getLength());
        System.out.println("Breadth is "+re.getBreadth());


    }
}
