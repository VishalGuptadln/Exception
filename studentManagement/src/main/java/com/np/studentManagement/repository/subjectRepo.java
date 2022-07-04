package com.np.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.np.studentManagement.entity.subject;

public interface subjectRepo extends JpaRepository<subject, Integer> {

}
