package com.example2;

import java.util.HashMap;
import java.util.Scanner;

//declaring a class 
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, Student> ss = new HashMap<>();

		// decalaring a variable
		String student;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating countryInformation object
		Student sdet = new Student();

		// adding some countries

		sdet.put("Farwa", new Student(101, "Farwa ", "Java Course", "Ful1 Fees  Paid "));
		sdet.put("Kainat", new Student(102, "Kainat", "Java Course", "Half Fees Paid "));
		sdet.put("Waniya", new Student(103, "Waniya", "Java Course", "Full fees Paid "));
		sdet.put("Javed", new Student(104, "Javed ", "Java Course ", "3/4 Fees paid "));
		sdet.put("Zeba", new Student(105, "Zeba ", "Java Course ", "Full Fees Paid "));

		System.out.println("Student Details:");
		System.out.println("Enter the Student:");
		student = sc.nextLine();

		// student is present or not
		boolean status = sdet.containsKey(student);

		// displaying the information

		if (status) {
			System.out.println("STUDENT ");
			ss = sdet.get(student);
			System.out.println();

		}

		else {
			System.out.println("Student not found ");
		}
	}

}
//end of a class 
