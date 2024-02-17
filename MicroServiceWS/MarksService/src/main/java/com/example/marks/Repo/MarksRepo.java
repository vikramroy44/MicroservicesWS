package com.example.marks.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marks.Entity.StdMarks;

public interface MarksRepo extends JpaRepository<StdMarks, Integer> {

}
