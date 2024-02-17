package com.example.marks.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marks.Entity.StdMarks;
import com.example.marks.Repo.MarksRepo;

@Service
public class MarksService implements MarksServInterface {
    @Autowired
	private MarksRepo marksRepo;
    
    //StdMarks
	@Override
	public StdMarks  upsertMarks(StdMarks marks) {
		// TODO Auto-generated method stub
	return	this.marksRepo.save(marks);
		
	}

	@Override
	public StdMarks getMarks(int marksId) {
		// TODO Auto-generated method stub
		Optional<StdMarks> value = this.marksRepo.findById(marksId);
		if(value.isPresent()) {
			return value.get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<StdMarks> getAllMarks() {
		// TODO Auto-generated method stub
		return 	this.marksRepo.findAll();
		
	}

	@Override
	public String deleteMarks(int marksId) {
		// TODO Auto-generated method stub
		Optional<StdMarks> value = this.marksRepo.findById(marksId);
		if(value.isPresent()) {
		    this.marksRepo.deleteById(marksId);
		    return "Delete Success";
		}
		else {
			return "Record Not Found";
		}
	}

}
