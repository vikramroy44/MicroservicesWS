package com.example.student.service;

import java.util.List;

import com.example.student.entity.Student;

public interface StudentService {
	
	public Student upsertStudent(Student student);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudent();
	
	public String deleteById(int id);
	
	

}
