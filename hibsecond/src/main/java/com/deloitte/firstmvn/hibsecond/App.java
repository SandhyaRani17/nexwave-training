package com.deloitte.firstmvn.hibsecond;
import java.sql.Date;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.firstmvn.hibsecond.Employee;
import com.deloitte.firstmvn.hibsecond.dao.EmployeeDAO;
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
    	prop.put("hibernate.hbm2ddl.auto","create");
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Employee.class);
        cfg.addProperties(prop);
        SessionFactory factory=cfg.buildSessionFactory();
        EmployeeDAO edao = new EmployeeDAO(factory);
        Employee e1 = new Employee(131,"john miller",2100,new Date(2020,2,1));
        edao.modifyEmployee(e1);
       /* e1=edao.getEmployee(102);
        if(e1!=null)
            System.out.println(e1.getEname()+"  "+e1.getSalary()+"   "+e1.getDoj());*/
        factory.close();
       /* Session session=factory.openSession();
        Employee e =new Employee(110,"Arunvi",1090,new Date(1990,10,10));
        e.setEname("sruthi");
        e.setSalary(2343);
        Transaction trans = session.beginTransaction();
        session.delete(e);
      if(e!=null)
        System.out.println(e.getEname()+"  "+e.getSalary()+"   "+e.getDoj());
       Transaction trans = session.beginTransaction();
        session.save(e);
        trans.commit();
        session.close();*/
       
        
    }
}
