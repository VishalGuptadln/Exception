package com.np.studentManagement.entity;




import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@EnableJpaAuditing
public class AuditableStudent {
	
	//@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
    private Date createdOn;

	@LastModifiedDate
    private Date modifiedOn;
}
