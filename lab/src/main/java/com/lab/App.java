package com.lab;

import com.dao.StudentDao;
import com.entity.Student;
import com.entity.StudentDetail;

/**
 * Hello world!
 *
 */
public class App 
{
	 // Save two student
    Student student = new Student(101, "farwa" );
    StudentDetail studentDetail = new StudentDetail(101, 1);
    studentDetail.setStudent(student);
    student.setStudentDetail(studentDetail);
   
    Student student1 = new Student(102, "haider");
    StudentDetail studentDetail1 = new StudentDetail(102, 2);
    studentDetail1.setStudent(student1);
    student1.setStudentDetail(studentDetail1);
   
    StudentDao studentDao = new StudentDao();
    studentDao.saveStudent(student);
    studentDao.saveStudent(student1);
    
    List<Student> students = studentDao.getAllStudent();
	students.forEach(studentTemp -> System.out.println(studentTemp.getStudentId()));
}
