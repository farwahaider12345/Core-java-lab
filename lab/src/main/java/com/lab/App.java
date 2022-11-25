package com.lab;

import com.dao.StudentDao;
import com.entity.Student;
import com.entity.StudentDetail;

public class App {
	public static void main(String[] args) {
		// Create student and course object
		Student student1 = new Student("farwa", "maths");
		StudentDetail studentdetail1 = new StudentDetail("Javed");
		student1.setStudentDetail(studentdetail1);
		studentdetail1.setStudent(student1);

		Student student2 = new Student("Haider", "Science");
		StudentDetail studentdetail2 = new StudentDetail("Qasim");
		student2.setStudentDetail(studentdetail2);
		studentdetail2.setStudent(student2);

		Student student3 = new Student("Kainat", "Arts");
		StudentDetail studentdetail3 = new StudentDetail("Firoz");
		student3.setStudentDetail(studentdetail3);
		studentdetail3.setStudent(student3);

		Student student4 = new Student("Waniya", "Physics");
		StudentDetail studentdetail4 = new StudentDetail("Fahmi");
		student4.setCourse(studentdetail4);
		studentdetail4.setStudent(student4);

		// Create studentDao object
		StudentDao studentDao = new StudentDao();
		// Add student
		studentDao.saveStudent(student1);
		studentDao.saveStudent(student2);
		studentDao.saveStudent(student3);
		studentDao.saveStudent(student4);

		// Delete student
//			Student student = studentDao.deleteStudent(student1.getStudentId());
//			System.out.println("STUDENT DELELTED : " + s.getFirstName());

		// Update student
//			student2.setFirstName("Zeeshan");
//			studentDao.updateStudent(student2);

	}
}