package com.np.studentManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.np.studentManagement.entity.student;

public interface studentRepo extends JpaRepository<student, Integer> {
		
	public List<Object> getUserByRollNo(int id);

}
