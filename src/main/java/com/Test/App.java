package com.Test;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.daoimpl.EmployeeDaoImpl;
import com.model.Employee;

public class App {

	public static void menu() {
		System.out.println("EMPLOYEE");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Display all the employee");
		System.out.println("4.Exit");
	}

	// main method
	public static void main(String[] args) {
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);

		// creating object of
		EmployeeDao employee = new EmployeeDaoImpl();

		// declaring variable choice

		try {
			int ch = 0;
			do {
				menu();
				ch = sc1.nextInt();
				// Switch cases
				switch (ch) {
				// case 1
				case 1:
					employee.addEmployee();
					System.out.println("Employee Added.");
					break;
				// case2
				case 2:
					System.out.println("Enter the Id to be deleted:");
					int id = sc1.nextInt();
					boolean flag = employee.deleteEmployee(id);
					if (flag)
						System.out.println("Employee deleted");
					else
						System.out.println("Employee not found");
					break;

				// case 3
				case 3:
					Employee.displayAll();
					break;

				// case 4
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input ");

				}

			} while (ch != 6);

			// end of do while
			sc1.close(); // scanner close
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
