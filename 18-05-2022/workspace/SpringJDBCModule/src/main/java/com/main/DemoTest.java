package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.mysql.cj.jdbc.Driver;
import com.service.EmployeeService;

public class DemoTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	List<Employee> listOfemp  = es.getAllEmployeeDetails();
	
	listOfemp.forEach(emp->System.out.println(emp));
	}

}
