package com.vikram.subject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vikram.subject.entity.Subject;
import com.vikram.subject.repo.SubjectRepo;

@Service
public class SubjectService implements SubjectIntf {
    
	@Autowired
	private SubjectRepo subjRepo;
	@Override
	public Subject upsert(Subject subject) {
		// TODO Auto-generated method stub
		return	this.subjRepo.save(subject);
		
		
	}

	@Override
	public Subject getSubjct(int id) {
		// TODO Auto-generated method stub
		return this.subjRepo.findById(id).get();
	}

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		return this.subjRepo.findAll();
	}

	@Override
	public Subject getSubjByStdId(int stdId) {
		// TODO Auto-generated method stub
		Subject subjBystdId = this.subjRepo.findByStdid(stdId);
		return subjBystdId;
	}

}
