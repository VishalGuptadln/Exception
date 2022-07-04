package com.np.studentManagement.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingPartnerApiRepo extends JpaRepository<TrainingPartnerApi, Integer> {

}
