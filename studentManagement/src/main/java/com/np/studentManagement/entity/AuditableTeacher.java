package com.np.studentManagement.entity;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@EnableJpaAuditing
public class AuditableTeacher {
	
//	@Temporal(TemporalType.DATE)
//	@CreatedDate
//    private Date createdOn;
//
//	//@Temporal( TemporalType.TIMESTAMP)
//	@LastModifiedDate
//    private Date modifiedOn;

}
