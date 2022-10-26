/*
 * Test and Example 2
 * @author: Farwa haider 
 * @Date: 26 oct 2022
 */

package com.example2;

//declaring a class 
public class Student {

	// instance variable
	private int id;
	private String name;
	private String course;
	private String fees;

	// default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor

	public Student(int id, String name, String course, String fees) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fees = fees;
	}

	// getters and setters

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	// toString method
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}

	public boolean containsKey(String student) {
		// TODO Auto-generated method stub
		return false;
	}

}
//end of a class 
