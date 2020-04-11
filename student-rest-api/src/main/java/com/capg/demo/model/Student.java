package com.capg.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Student_details")
public class Student {

	private int studentId;
	private String studentName;
	private LocalDate dob ;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + "]";
	}
	public Student(int studentId, String studentName, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dob = dob;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	 	
}
