package com.example3;

public class Author {

	private String authorName;
	private int noOfBooks;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorName, int noOfBooks) {
		super();
		this.authorName = authorName;
		this.noOfBooks = noOfBooks;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", noOfBooks=" + noOfBooks + "]";
	}

}
