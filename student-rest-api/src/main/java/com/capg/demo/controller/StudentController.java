package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.capg.demo.model.Student;
import com.capg.demo.service.StudentService;
 
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> allStudents=service.getListOfStudents();
		
		return new ResponseEntity<List<Student>>(allStudents,HttpStatus.OK);
	}
	
	@GetMapping("/students/id/{id}")
	
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int studentId) {
		
		Student student= service.getStudent(studentId);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		service.addStudent(student);
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}

	@PutMapping("/students")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		
		
		Student newStudentData=service.updateStudent(student);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}

	@DeleteMapping("/students/id/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") int studentId) {
		
			return new ResponseEntity<Student>(HttpStatus.OK);
		
	}
}