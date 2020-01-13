package com.deloitte.thirdmvn.firstspringapp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deloitte.thirdmvn.firstspringapp.beans.Address;
import com.deloitte.thirdmvn.firstspringapp.beans.Person;

@Configuration
public class AppConfig
{
	@Bean
	public Address address()
	{
		return new Address("5-6-7","banglore","karnataka");
	}
	@Bean
	public Person person()
	{
		return new Person(101,"ajay",address());
	}
}
