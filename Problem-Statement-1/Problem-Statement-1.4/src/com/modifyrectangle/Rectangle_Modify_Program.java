package com.modifyrectangle;

import java.util.Scanner;

public class Rectangle_Modify_Program {
	
	float length;
	float width;
	float area;
	float parameter;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	public Rectangle_Modify_Program()
	{
		length=1;
		width=1;
	}
	
	void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of rectangle = ");
		length = in.nextInt();
		System.out.println("Enter width of rectangle= ");
		width=in.nextInt();
	}
	
	void areaRectangle()
	{
		area = length*width;
	}
	
	void perimeterRectangle()
	{
		parameter = 2*(length+width);
	}
	
	void display()
	{
		if(length>0.0 && length<20.0)
		{
			System.out.println("Area of Rectangle = "+area);
			System.out.println("parameter of Rectangle = "+parameter);
		}
			
			else
			{
				System.out.println("Out of length");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle_Modify_Program obj1 = new Rectangle_Modify_Program();
		obj1.input();
		obj1.areaRectangle();
		obj1.perimeterRectangle();
		obj1.display();

	}

}
