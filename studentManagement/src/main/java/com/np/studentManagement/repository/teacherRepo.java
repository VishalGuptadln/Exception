package com.np.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.np.studentManagement.entity.teacher;
@Repository
public interface teacherRepo extends JpaRepository<teacher, Integer> {
	
}
