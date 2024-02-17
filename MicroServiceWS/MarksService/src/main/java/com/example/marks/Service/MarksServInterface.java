package com.example.marks.Service;

import java.util.List;

import com.example.marks.Entity.StdMarks;

public interface MarksServInterface {
	public StdMarks upsertMarks(StdMarks marks);

	public StdMarks getMarks(int marksId);
	
	public List<StdMarks> getAllMarks();
	
	public String deleteMarks(int marksId);
}
