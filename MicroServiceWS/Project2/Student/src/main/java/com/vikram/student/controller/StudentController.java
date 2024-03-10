package com.vikram.student.controller;
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

import com.vikram.student.entity.MyStudent;
import com.vikram.student.service.StudentService;


@RestController
@RequestMapping("/mstudent")
public class StudentController {
	
	@Autowired
	private StudentService stdService;
	
	@GetMapping("/test")
  public String test() {
	  return "Student Controller ok";
  }
   @PostMapping("/save")
	public ResponseEntity<MyStudent> createstd(@RequestBody MyStudent std){
		
		MyStudent student = this.stdService.upsertStudent(std);
		
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}
   @GetMapping("/{sid}")
   public ResponseEntity<MyStudent> getStudent(@PathVariable int sid){
	   MyStudent student = this.stdService.getStudentById(sid);
	   return new ResponseEntity<MyStudent>(student, HttpStatus.OK);
   }
   @GetMapping()
   public ResponseEntity<List<MyStudent>> getStdAll(){
	   List<MyStudent> allStudent = this.stdService.getAllStudent();
	   
	   return new ResponseEntity<>(allStudent, HttpStatus.OK);
   }
}
