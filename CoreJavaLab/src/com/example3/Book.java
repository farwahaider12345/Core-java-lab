package com.example3;

public class Book {

	// instance variable
	private int id;
	private String bookName;
	private double price;
	private Author aur;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String bookName, double price, Author aur) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.aur = aur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAur() {
		return aur;
	}

	public void setAur(Author aur) {
		this.aur = aur;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", Price=" + price + "]";
	}

}
