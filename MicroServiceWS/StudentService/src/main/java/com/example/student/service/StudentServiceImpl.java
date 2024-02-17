package com.example.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.student.Repo.StudentRepo;
import com.example.student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
   
	private StudentRepo studentRepo;
	
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public Student upsertStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentRepo.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> optional = this.studentRepo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
	   
		return this.studentRepo.findAll();
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		    Optional<Student> findById = this.studentRepo.findById(id);
		    if(findById.isPresent()) {
		    	this.studentRepo.deleteById(id);
		    	return "Record Deleted";
		    }else {
		    	return "Recoed Not Found";
		    }
		
	}

}
