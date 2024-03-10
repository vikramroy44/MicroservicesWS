package com.vikram.student.service;

import java.util.List;

import com.vikram.student.entity.MyStudent;

public interface StudentInterface {
	
    public MyStudent upsertStudent(MyStudent student);
	
	public MyStudent getStudentById(int id);
	
	public List<MyStudent> getAllStudent();
	
	public String deleteById(int id);
	

}
