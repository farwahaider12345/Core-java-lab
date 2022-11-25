package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "course")
	private String course;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentdetailid")
	private StudentDetail studentDetail;

	// default constructor
	public Student() {

	}

	// parameterized constructor

	public Student(int id, String firstName, String course, StudentDetail studentDetail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.course = course;
		this.studentDetail = studentDetail;
	}

	// getter and setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", course=" + course + ", studentDetail="
				+ studentDetail + "]";
	}

}
