package com.example.marks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.example.marks.Entity.StdMarks;
import com.example.marks.Service.MarksService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/marks")
public class MarksController {

	@Autowired
	private MarksService marksService;
	@GetMapping("/test")
	public String test() {
		return "Marks test ok";
	}
	@PostMapping()
	public ResponseEntity<StdMarks> saveMarks(@RequestBody StdMarks marks){
		StdMarks marks2  = this.marksService.upsertMarks(marks);
		
	return new ResponseEntity<StdMarks>(marks2, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StdMarks> getMarksById(@PathVariable int id){
		StdMarks marks = this.marksService.getMarks(id);
		return new ResponseEntity<StdMarks>(marks, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<StdMarks>> getMarksAll(){
		List<StdMarks> markslist = this.marksService.getAllMarks();
		return new ResponseEntity<List<StdMarks>>(markslist, HttpStatus.OK);
	}
	
	@PutMapping()
	public ResponseEntity<StdMarks> updateMarks(@RequestBody StdMarks marks){
		StdMarks marks2  = this.marksService.upsertMarks(marks);
	return new ResponseEntity<StdMarks>(marks2, HttpStatus.CREATED);
	}
}
