package com.ex.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.model.StudentModel;
import com.ex.repository.StudentRepository;

@Service
public class StudentService {
	Logger log=LoggerFactory.getLogger(StudentService.class);

	@Autowired
	StudentRepository rs;
	public void insertIntoDB(StudentModel student) {
		log.info("in save");
		rs.save(student);
	}
	
	public void fetchFromDB() {
		log.info(rs.findAll().toString());
	}

	public void fetchFromDBbyId(String id) {

		log.info(rs.findById(Integer.parseInt(id)).toString());
	}

	public void updateValuesInDB(StudentModel student) {
		log.info(student.toString());
		rs.save(student);
	}

	public void deleteFromDB(int roll_no) {
		rs.deleteById(roll_no);
	}
}
