package com.example.marks.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class StdMarks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int marksId;
	private int science;
	private int maths;
	private int english;
	private int hindi;
	private int socSci;
	//private int stId;
	

}
