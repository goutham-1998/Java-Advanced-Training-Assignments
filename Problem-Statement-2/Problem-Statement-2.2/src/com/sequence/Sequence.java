package com.sequence;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		
	     Scanner scn = new Scanner(System.in);        
	     System.out.println("Please Enter First Number = ");  
	     int firstNumber = scn.nextInt();  
	     int secondNumber = scn.nextInt();   
	     int sum = 0;  
	     System.out.print(firstNumber + " " + secondNumber + " ");  
	     for (int counter = 0; counter < 13; counter++) {  
	       sum = firstNumber + secondNumber;  
	       System.out.print(sum + " ");  
	       firstNumber = secondNumber;  
	       secondNumber = sum;  
	       
	     }  
	   }  
	 }  