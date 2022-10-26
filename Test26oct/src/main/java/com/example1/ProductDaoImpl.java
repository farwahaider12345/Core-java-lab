package com.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {

	List<Product> pList = new ArrayList<Product>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);
	// creating object
	Product pp = new Product();

	// creating a add method
	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id :"); // printing
		pp.setId(sc.nextInt());
		System.out.println("Enter the name :"); // printing
		pp.setName(sc.next());
		System.out.println("Enter the brand :"); // printing
		pp.setBrand(sc.next());
		System.out.println("Enter the Quantity :"); // printing
		pp.setQuantity(sc.next());

		// adding the product
		pList.add(pp);
		System.out.println(pList);

	}

	// creating delete method
	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Product pdel = null;
		// finding the product
		for (Product p : pList) {
			if (p.getId() == id)
				pdel = p;
		}

		if (pdel == null)
			status = false;
		else {
			status = true;
		}

		return status;
	}
}
