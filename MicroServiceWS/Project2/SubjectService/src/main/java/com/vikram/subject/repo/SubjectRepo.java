package com.vikram.subject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikram.subject.entity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer> {

	Subject findByStdid(int stdId);

}
