package com.deloitte.fifthmvn.hibfifth.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.deloitte.fifthmvn.hibfifth.entity.Student;
public class StudentDAO 
{
	SessionFactory factory=null;
	public StudentDAO(SessionFactory factory)
	{
		this.factory=factory;
	}
	public boolean insertStudent(Student s)
	{
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(s);
		trans.commit();
		session.close();
		return true;
	}
	public Student getStudent(int rno)
	{
		Session session = factory.openSession();
		Student s =session.get(Student.class,rno);
		return s;
	}
	public boolean deleteStudent(int rno)
	{
		Session session = factory.openSession();
		Student s =new Student();
		s.setRno(rno);
		Transaction trans = session.beginTransaction();
		session.delete(s);
		trans.commit();
		session.close();
		return true;
	}
	public Student modifyEmployee(Student s)
	{
		Session session = factory.openSession();
		session.update(s);
		Transaction trans = session.beginTransaction();
		trans.commit();
		session.close();
		return s;
	}
}
