package com.np.studentManagement.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectId;
	
	@NotNull(message = "{APP006}")
	//@Column(length = 30)
	@Size(min = 3,max = 30,message = "{APP003}")
	private String subject;
	
	@CreationTimestamp
	@Column(updatable = false)
    private Date createdOn;

	@UpdateTimestamp
    private Date modifiedOn;

}
