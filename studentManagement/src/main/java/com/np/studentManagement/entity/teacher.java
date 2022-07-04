package com.np.studentManagement.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class teacher{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	

	//@Column(length = 30)
	@NotNull(message = "{APP006}")
	@Size(min = 3,max = 15,message = "{APP001}")
	private String teacherName;
	
	@NotNull(message = "{APP006}")
	@Size(min = 3,max = 15,message = "{APP002}")
	private String department;
	
	@CreationTimestamp
	@Column(nullable=false, updatable = false)
    private Date createdOn;

	@UpdateTimestamp
    private Date modifiedOn;
	
	@OneToOne(cascade = CascadeType.ALL)
	private subject sub;
	

}
