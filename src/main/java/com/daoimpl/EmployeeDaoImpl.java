package com.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDao;
import com.model.Employee;

public abstract class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> eList = new ArrayList<Employee>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

	// creating Employee object
	// method for adding the employee

	public void addEmployee() {

		// creating student object
		Employee ee = new Employee();
		// input the details of student
		System.out.println("Enter the id :"); // printing
		ee.setId(sc.nextInt());
		System.out.println("Enter the name :"); // printing
		ee.setName(sc.next());
		System.out.println("Enter the salary :");// printing
		ee.setSalary(sc.nextFloat());

		// adding the employee into the collection
		eList.add(ee);
		System.out.println(eList);

	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee ddel = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				ddel = e;
		}
		// check whether the employee record is present
		if (ddel == null)
			status = false;
		else {
			eList.remove(ddel);
			status = true;
		}

		return status;
	}

	public Employee findEmployee(int id) {

		Employee efind = null;
		// finding the student
		for (Employee e : eList) {
			if (e.getId() == id)
				efind = e;
		}

		return efind;
	}

	public void displayAll() {

		// displaying the employee
		for (Employee e : eList) {
			System.out.println(e);
		}

	}

}
