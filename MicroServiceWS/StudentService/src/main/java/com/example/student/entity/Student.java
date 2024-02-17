package com.example.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Student {
    
	//@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stdId;
	@Column(name = "name")
	private String studentName;
	@Column(name = "clas")
	private int studentClass;
	@Column(name = "address")
	private String  studentAddress;
	
	
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentAddress=" + studentAddress + "]";
	}
	
	
	
	
	
	
	
	
}
