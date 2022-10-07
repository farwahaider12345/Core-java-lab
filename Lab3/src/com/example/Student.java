package com.example;

public class Student {

	private String name;
	private int id;
	private int averageMarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, int rollno) {
		super();
		this.name = name;
		this.id = id;
		this.averageMarks = averageMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAverageMarks() {
		return averageMarks;
	}

	public void setRollno(int rollno) {
		this.averageMarks = averageMarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", averageMarks=" + averageMarks + "]";
	}

}
