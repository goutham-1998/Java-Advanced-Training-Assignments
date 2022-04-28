package com.book;

import java.util.Scanner;

public class TextBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Title Of the Book");
		String booktitle=sc.nextLine();
		
		System.out.println("Price ");
		int price=sc.nextInt();
		sc.nextLine();
		
		Book n=new Book();
		n.setBooktitile(booktitle);
		n.setBookprice(price);
		System.out.println("Book Details");
		System.out.println("Book Title :"+n.getBooktitile());
		System.out.println("Book Price :"+n.getBookprice());
		
	}

}
