package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdetail")

public class StudentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// variables
	@Column(name = "id")
	private int id;

	@Column(name = "rollno")
	private int rollno;

	@OneToOne(mappedBy = "studentDetail", cascade = CascadeType.ALL)
	private Student student;

	// default constructor
	public StudentDetail() {

	}

	// Parameterized Constructor

	public StudentDetail(int id, int rollno) {
		super();
		this.id = id;
		this.rollno = rollno;

	}

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", rollno=" + rollno + ", student=" + student + "]";
	}

}
