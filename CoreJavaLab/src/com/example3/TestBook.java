package com.example3;

public class TestBook {

	static void displayDetails(Book b) {

		System.out.println(b);
	}

	public static void main(String[] args) {

		Book b1 = new Book(101, "Rich Dad Poor Dad", 400, new Author("Farwa ", 3));

		System.out.println("Details are: ");

		displayDetails(b1);
	}
}