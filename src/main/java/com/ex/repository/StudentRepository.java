package com.ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.model.StudentModel;
@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Integer> {

}
