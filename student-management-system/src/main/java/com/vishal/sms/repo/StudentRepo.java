package com.vishal.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.sms.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
