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
		
		Student student = new Student();
		student.setId(348);
		student.setName("Vidya");
		student.setCity("Mumbai");
		
		int result = studentDao.insert(student);
		
		System.out.println("Student Added :" + result);
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);	
//		String query = "insert into student(id, name, city) values(?,?,?)";
//		int result = template.update(query, 45, "Ulka Rajput", "Pune");
//		System.out.println("Number of Record inserted : " + result);
	}
}