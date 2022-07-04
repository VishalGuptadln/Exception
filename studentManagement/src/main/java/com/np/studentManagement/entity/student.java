package com.np.studentManagement.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class student{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	
	@NotNull(message = "{APP006}")
	@Size(min = 3,max = 15,message = "{APP004}")
	private String studentName;
	
	@NotNull(message = "{APP006}")
	@Size(min = 3,max = 15,message = "{APP005}")
	private String year;
	
	@CreationTimestamp
	@Column(nullable=false, updatable = false)
    private Date createdOn;

	@UpdateTimestamp
    private Date modifiedOn;
	
	@ManyToMany(targetEntity = teacher.class, cascade = CascadeType.MERGE )
	@JoinColumn(name = "fk", referencedColumnName = "tId")
	private List<teacher> teac;

	
}
