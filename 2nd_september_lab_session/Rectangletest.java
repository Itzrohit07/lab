package com.packages;

import java.util.Scanner;

class Rectangle{
    private double length;
    private double breadth;
    Rectangle(double x,double y){
         length=x;
         breadth=y;

    }
    void area() {
        System.out.println(length*breadth);
    }
}

public class Rectangletest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length:");
        double a1 = sc.nextDouble();
        System.out.println("enter the first breadth");
        double a2 = sc.nextDouble();
        System.out.println("enter second length");
        double b1 = sc.nextDouble();
        System.out.println("enter the second breadth");
        double b2 = sc.nextDouble();
        Rectangle t1 = new Rectangle(a1, a2);
        Rectangle m1 = new Rectangle(b1, b2);
        t1.area();
        m1.area();


    }
}
