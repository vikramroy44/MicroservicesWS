package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentServiceImpl;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl stService;
	
	@GetMapping("/test")
	public String test() {
		return "Test Executed";
	}
	
	@PostMapping()
	public ResponseEntity<Student> saveStudent(@RequestBody Student st){
		System.out.println("Creat Invoked");
		Student student = this.stService.upsertStudent(st);
		
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}
	@PostMapping()
	public ResponseEntity<Student> updateStudent(@RequestBody Student st){
		System.out.println("Update Invoked");
		Student student = this.stService.upsertStudent(st);
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id){
		System.out.println("Get Invoked");
		Student student = this.stService.getStudentById(id);
		System.out.println(student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Student>> getAllStudent(){
		System.out.println("Get All Invoked");
		List<Student> student = this.stService.getAllStudent();
		System.out.println(student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
