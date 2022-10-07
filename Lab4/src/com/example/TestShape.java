package com.example;

import java.util.Scanner;

public class TestShape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.println("Rectangle:");
		System.out.println("Enter the area:");
		r.setArea(sc.nextInt());

		Scanner sc = new Scanner(System.in);
		Square s = new Square();
		System.out.println("Square:");
		System.out.println("Enter the area:");
		s.setArea(sc.nextInt());

		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		System.out.println("Circle:");
		System.out.println("Enter the area:");
		c.setArea(sc.nextInt());

	}
}
