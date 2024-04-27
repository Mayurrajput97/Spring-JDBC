package com.spring.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.entity.Student;

public class StudentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String query = "insert into student(id, name, city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public int updation(Student student) {
		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
