package com.example.demo1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.Entity.Student;

//Studentrepository that extends CrudRepository  
@Repository
public interface Studentrepository extends CrudRepository<Student,Long> {
	
}