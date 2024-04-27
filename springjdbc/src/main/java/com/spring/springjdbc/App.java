package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.dao.StudentDao;
import com.spring.springjdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//		Student student = new Student();
//		student.setId(39);
//		student.setName("Mayur Rajput");
//		student.setCity("Pune");
//
//		int result = studentDao.insert(student);
//
//		System.out.println("Student Added :" + result);
		
		Student student = new Student();
		student.setId(47);
		student.setName("Vidya Rajput");
		student.setCity("Ghoti");
		int  result = studentDao.updation(student); 
		
		System.out.println("Data is Changed : " + result);
		
		

	}
}