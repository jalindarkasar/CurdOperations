package com.example.demo1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo1.Entity.Student;
import com.example.demo1.repository.Studentrepository;

@Service
public class StudentServices {
	
	@Autowired
    private Studentrepository repo;
	
	public Iterable<Student> listAll() {
        return this.repo.findAll();
    }
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Student students)   
	{  
		repo.save(students);  
	} 
	
	public Student getStudentById(long id)   
	{  
		return repo.findById(id).get();  
	}
		 
		 
	public void update(Student students, int id)   
	{  
		repo.save(students);  
	}  	

	public void delete(long id)   
	{  
		repo.deleteById(id);  
	}  
		  
}