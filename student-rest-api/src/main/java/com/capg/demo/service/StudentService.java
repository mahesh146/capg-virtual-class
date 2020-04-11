package com.capg.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.model.Student;
import com.capg.demo.repo.StudentJpaRepo;
import com.capg.demo.repo.StudentRepo;
import com.capg.exceptions.StudentNotFoundException;

@Service
public class StudentService {
	
	@Autowired(required = true)
	StudentJpaRepo studentRepo;

	public List<Student> getListOfStudents(){
      	return studentRepo.findAll();
	}
	public Student getStudent(int studentId) {
		if(!studentRepo.existsById(studentId)) {
			throw new StudentNotFoundException("student with id : ["+studentId+"] Not Found"); 
		}
		return studentRepo.getOne(studentId);
	}
	@Transactional
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}	
	@Transactional
	public boolean deleteStudent(int studentId) {
		studentRepo.deleteById(studentId);
		return !studentRepo.existsById(studentId);
	}
	@Transactional
	public Student updateStudent(Student newStudentData) {
		Student student=studentRepo.getOne(newStudentData.getStudentId());		
		student.setDob(newStudentData.getDob());
		student.setStudentName(newStudentData.getStudentName());
		studentRepo.save(student);
		return student;

}
}