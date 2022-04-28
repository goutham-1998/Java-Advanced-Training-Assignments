package com.rectangle;

import java.util.Scanner;

public class Rectangle {
	int len; 
    int bre; 
    int area; 
    int perimeter;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        len = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        bre = in.nextInt();
    }

    void calculate() {
        area = len * bre;
        perimeter = 2 * (len + bre);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.calculate();
        obj.display();
    }
}