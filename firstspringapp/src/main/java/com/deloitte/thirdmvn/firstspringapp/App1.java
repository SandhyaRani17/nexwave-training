package com.deloitte.thirdmvn.firstspringapp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.thirdmvn.firstspringapp.Config.AppConfig;
import com.deloitte.thirdmvn.firstspringapp.beans.Person;
import com.deloitte.thirdmvn.firstspringapp.beans.Wisher;
public class App1 
{
	public static void main(String[] args)
	{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Person p = context.getBean(Person.class,"per1");
	System.out.println(p.getSsn()+"  "+p.getAddress().getCity());
	System.out.println(p.getAddress().getState());
	}
}
