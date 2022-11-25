package com.dao;
import java.util.List;

import com.entity.StudentDetail;
import com.mysql.cj.Session;
import com.util.HibernateUtil;
import jakarta.transaction.Transaction;

public class StudentDetailDao {

		public void saveStudent(StudentDetail studentdetail) {
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				// start a transaction
				transaction = session.beginTransaction();
				// save the student object
				session.save(studentdetail);
				// commit transaction
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}

		public void updateStudentDetail(StudentDetail studentdetail) {
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				// start a transaction
				transaction = session.beginTransaction();
				// save the student object
				session.update(studentdetail);
				// commit transaction
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}

		public void deleteStudentDetail(int id) {

			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				// start a transaction
				transaction = session.beginTransaction();

				// Delete a student
				StudentDetail studentdetail = session.get(StudentDetail.class, id);
				if (studentdetail != null) {
					session.delete(studentdetail);
					System.out.println("Student detail is deleted");
				}

				// commit transaction
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}

		public StudentDeatil getStudentDeatil(int id) {

			Transaction transaction = null;
			Student student = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				// start a transaction
				transaction = session.beginTransaction();
				// get an student
				student = session.get(Student.class, id);
				// commit transaction
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return student;
		}

		@SuppressWarnings("unchecked")
		public List<StudentDetail> getAllStudentDetail() {

			Transaction transaction = null;
			List<StudentDetail> listOfStudentDetail = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				// start a transaction
				transaction = session.beginTransaction();
				// get an student object

				listOfStudentDetail = session.createQuery("from Student").getResultList();

				// commit transaction
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			return listOfStudentDetail;
		}
	}

}
