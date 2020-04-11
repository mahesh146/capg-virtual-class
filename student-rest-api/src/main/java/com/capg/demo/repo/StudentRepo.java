package com.capg.demo.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.demo.model.Student;

@Repository
public class StudentRepo {
	@PersistenceContext
	EntityManager em;
	
	public Student addStudent(Student student) {
		em.persist(student);
		return student;
	}
	
	public  Student getUser(int studentId) {
		return em.find(Student.class, studentId);
	}
	
}