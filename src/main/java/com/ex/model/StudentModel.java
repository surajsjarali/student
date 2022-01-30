package com.ex.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name="STUDENT_DATA")
@Getter
@Setter
public class StudentModel {
	@Id
	@PositiveOrZero
	int roll_no;
	@Min(value = 0)
	@Max(value = 100)
	int m1;
	@Min(value = 0)
	@Max(value = 100)
	int m2;
	@NotNull
	@Size(min=2, message="Name should have atleast 2 characters")
	String name;

	@Override
	public String toString() {
		return "StudentModel [roll_no=" + roll_no + ", m1=" + m1 + ", m2=" + m2 + ", name=" + name + "]";
	}
	
}
