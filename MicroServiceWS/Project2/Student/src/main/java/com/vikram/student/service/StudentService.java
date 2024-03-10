package com.vikram.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.student.entity.MyStudent;
import com.vikram.student.repo.StudentRepo;

@Service
public class StudentService implements StudentInterface{
    @Autowired
	private StudentRepo stdRepo;
    @Autowired
    private SubjectClient subjClient;
	@Override
	public MyStudent upsertStudent(MyStudent student) {
		// TODO Auto-generated method stub
		MyStudent save = this.stdRepo.save(student);
		return save;
	}

	@Override
	public MyStudent getStudentById(int id) {
		// TODO Auto-generated method stub
	  MyStudent student = this.stdRepo.findById(id).get();
	     student.setSubject(subjClient.subjByStdId(id));
	     return student;
	}

	@Override
	public List<MyStudent> getAllStudent() {
		// TODO Auto-generated method stub
		List<MyStudent> stdList = this.stdRepo.findAll();
		for(MyStudent std : stdList) {
			std.setSubject(subjClient.subjByStdId(std.getSid()));
		}
		return stdList;
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		Optional<MyStudent> std = this.stdRepo.findById(id);
		if(std.isPresent()) {
			this.stdRepo.deleteById(id);
			
			return "Record Deleted";
		}
		return "Record Not Found";
	}

}
