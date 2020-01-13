package com.deloitte.fifthmvn.hibfifth;
import java.sql.Date;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import  com.deloitte.fifthmvn.hibfifth.entity.Student;
import  com.deloitte.fifthmvn.hibfifth.dao.StudentDAO;
public class App 
{
    public static void main( String[] args )
    {
    	Properties prop = new Properties();
    	prop.put("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
    	prop.put("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:orcl");
    	prop.put("hibernate.connection.username","scott");
    	prop.put("hibernate.connection.password","tiger");
    	prop.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
    	prop.put("hibernate.show_sql","true");
    	//prop.put("hibernate.hbm2ddl.auto","create");
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.addProperties(prop);
        SessionFactory factory=cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans= session.beginTransaction();
        StudentDAO sdao = new StudentDAO(factory);
        Student s = new Student(101,"sandhya",new Date(1999,10,10),2500);
        sdao.insertStudent(s);
        session.save(s);
        trans.commit();
        session.close();
        factory.close();
    }
}
