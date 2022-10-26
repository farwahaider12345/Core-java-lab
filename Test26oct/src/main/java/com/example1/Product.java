package com.example1;

//declaring a class 
public class Product {

	// instance variable
	private int id;
	private String name;
	private String brand;
	private int quantity;

	// default constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Product(int id, String name, String brand, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// toString method
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", quantity=" + quantity + "]";
	}

	public void setQuantity(String next) {
		// TODO Auto-generated method stub

	}

}
