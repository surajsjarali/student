package com.ex.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

@Entity
@Table(name="STUDENT_DATA")
public class StudentModel {
	@Id
	int roll_no;
	@Max(value=100)
	int m1;
	@Max(value=100)
	int m2;
	String name;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentModel [roll_no=" + roll_no + ", m1=" + m1 + ", m2=" + m2 + ", name=" + name + "]";
	}
	
}
