package com.vishal.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.sms.entity.Student;
import com.vishal.sms.repo.StudentRepo;

@Service
public class service {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getAllStudents()
	{
		return studentRepo.findAll();
	}

	public void saveStudent(Student student) {
		studentRepo.save(student);		
	}

}
