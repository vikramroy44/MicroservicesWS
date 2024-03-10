package com.vikram.subject.service;

import java.util.List;

import com.vikram.subject.entity.Subject;

public interface SubjectIntf {
	
   public Subject upsert(Subject subject);
   
   public Subject getSubjct(int id);
   
   public  List<Subject> getAllSubject();
   
   public Subject getSubjByStdId(int stdId);
}
