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

	@Id // p
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "fathername")
	private String fatherName;

	@OneToOne(mappedBy = "studentDetail", cascade = CascadeType.ALL)
	private Student student;

	// default constructor
	public StudentDetail() {

	}

	public StudentDetail(long id, String fatherName, Student student) {
		super();
		this.id = id;
		this.fatherName = fatherName;
		this.student = student;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", fatherName=" + fatherName + ", student=" + student + "]";
	}

}