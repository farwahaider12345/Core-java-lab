package com.Test26oct;

import java.util.Scanner;

import com.example1.ProductDao;
import com.example1.ProductDaoImpl;

public class App {

	public static void menu() {
		System.out.println("Product");
		System.out.println("1. Add item");
		System.out.println("2. Delete item");
	}

	public static void main(String[] args) {

		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		ProductDao shop = new ProductDaoImpl();

		int ch = 0;
		do {
			menu();
			ch = sc1.nextInt();
			Object pp;
			switch (ch) {

			case 1:
				System.out.println("Enter the product you want to add:");
				break;

			case 2:
				System.out.println("Enter the product you want to deleted:");
				int id = sc1.nextInt();
				break;
			default:
				System.out.println("no product found ");
			}

		} while (ch != 2);

		sc1.close();
	}
}
