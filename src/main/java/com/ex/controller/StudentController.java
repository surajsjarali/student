package com.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ex.model.StudentModel;
import com.ex.service.StudentService;

import javax.validation.Valid;

@RestController
@RequestMapping("/student/v1")
public class StudentController {
	@Autowired
	StudentService service;
	@GetMapping("/get")
	public void getData(@Valid @RequestParam(required = false) String id) {
		//System.out.println("In get"+id);
		service.fetchFromDB();
	}

	@GetMapping("/get/{id}")
	public void getData1( @PathVariable String id) {

		service.fetchFromDBbyId(id);
	}

	@PostMapping("/post")
	public void postData(@Valid @RequestBody StudentModel student) {
		service.insertIntoDB(student);
	}
	@PutMapping("/put")
	public void putdata(@RequestBody StudentModel student) {
		service.updateValuesInDB(student);
	}

	@DeleteMapping("/delete")
	public void deleteData(@RequestParam int roll_no) {
		service.deleteFromDB(roll_no);
	}
}
