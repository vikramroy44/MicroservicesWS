package com.vikram.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.student.entity.MyStudent;

public interface StudentRepo extends JpaRepository<MyStudent, Integer> {

}
