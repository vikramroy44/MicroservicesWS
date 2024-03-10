package com.vikram.subject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.subject.entity.Subject;
import com.vikram.subject.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjeectController {
	
    @Autowired
	private SubjectService subjservice;
	
	@GetMapping("/test")
	public String test() {
		return "Subject Controller OK";
	}
	
	@PostMapping("/save")
	public ResponseEntity<Subject> saveSubject(@RequestBody Subject subj){
		Subject subject = this.subjservice.upsert(subj);
		return new ResponseEntity<Subject>(subject, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Subject> getSubject(@PathVariable int id  ){
		Subject subjct = this.subjservice.getSubjct(id);
		return new ResponseEntity<Subject>(subjct, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Subject>> allSubject(){
		List<Subject> allSubject = this.subjservice.getAllSubject();
		return new ResponseEntity<List<Subject>>(allSubject, HttpStatus.OK);
		
	}
	@GetMapping("/std/{stdid}")
	public ResponseEntity<Subject> subjByStdId(@PathVariable int stdid ){
		Subject subjByStdId = this.subjservice.getSubjByStdId(stdid);
		return new ResponseEntity<Subject>(subjByStdId, HttpStatus.OK);
	}
	
}
