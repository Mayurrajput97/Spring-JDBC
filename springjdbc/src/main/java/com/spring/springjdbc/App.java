package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/config.xml");

		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String query = "insert into student(id, name, city) values(?,?,?)";

		int result = template.update(query, 463, "Pavan Rajput", "Pune");
		System.out.println("Number of Record inserted : " + result);
	}
}