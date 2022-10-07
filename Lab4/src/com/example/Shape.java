package com.example;

public class Shape {

	private double height;
	private double width;
	private double area;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(double height, double width, double area) {
		super();
		this.height = height;
		this.width = width;
		this.area = area;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Shape [height=" + height + ", width=" + width + ", area=" + area + "]";
	}

}
