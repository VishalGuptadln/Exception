package com.np.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "nsdc_training_partner")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TrainingPartnerApi {

	@Id
	@Column(name = "nsdc_tpartner_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nsdc_tpartner_id;
	
	@Column(name = "training_partner")
	@JsonProperty("Training Partner")
	private String TrainingPartner;
	
	@Column(name = "scheme_name")
	@JsonProperty("Scheme Name")
	private String SchemeName;
	
	@Column(name = "state")
	@JsonProperty("State")
	private String State;
	
	@Column(name = "state_code")
	@JsonProperty("State Code")
	private String StateCode;
	
	@Column(name = "district")
	@JsonProperty("District")
	private String District;
	
	@Column(name = "district_code")
	@JsonProperty("District Code")
	private String DistrictCode;
	
	@Column(name = "block")
	@JsonProperty("Block")
	private String Block;
	
	@Column(name = "block_code")
	@JsonProperty("Block Code")
	private String BlockCode;
	
	@Column(name = "sector")
	@JsonProperty("Sector")
	private String Sector;
	
	@Column(name = "course_qp_nos")
	@JsonProperty("Course/ QP NOS")
	private String CourseQPNOS;
	
	@Column(name = "financial_year")
	@JsonProperty("Financial Year")
	private String FinancialYear;
	
	@Column(name = "trained_male")
	@JsonProperty("Trained (male)")
	private String TrainedMale;
	
	@Column(name = "placed_male")
	@JsonProperty("Placed (male)")
	private String PlacedMale;
	
	@Column(name = "self_employed_male")
	@JsonProperty("Self Employed (male)")
	private String SelfEmployedMale;
	
	@Column(name = "trained_female")
	@JsonProperty("Trained (female)")
	private String Trainedfemale;
	
	@Column(name = "placed_female")
	@JsonProperty("Placed (female)")
	private String Placedfemale;
	
	@Column(name = "self_employed_female")
	@JsonProperty("Self Employed  (female)")
	private String SelfEmployedfemale;
	
	@Column(name = "avg_salary_female")
	@JsonProperty("Avg Salary (female)")
	private String AvgSalaryfemale;
	
	@Column(name = "avg_salary_male")
	@JsonProperty("Avg Salary (male)")
	private String AvgSalarymale;
	
	@Column(name = "self_employed_ttl")
	@JsonProperty("Total Self Employed ")
	private String TotalSelfEmployed;
	
	@Column(name = "avg_salary_ttl")
	@JsonProperty("Total Avg Salary")
	private String TotalAvgSalary;
	
	@Column(name = "trained_transgndr")
	@JsonProperty("Trained (transgender) ")
	private String TrainedTransgender;
	
	@Column(name = "placed_transgndr")
	@JsonProperty("Placed (transgender)")
	private String PlacedTransgender;
	
	@Column(name = "self_employed_transgndr")
	@JsonProperty("Self Employed (transgender)")
	private String SelfEmployedTransgender;
	
	@Column(name = "avg_salary_transgndr")
	@JsonProperty("Avg Salary (transgender)")
	private String AvgSalaryTransgender;
	
	@Column(name = "trained_ttl")
	@JsonProperty("Total Trained")
	private String TotalTrained;
	
	@Column(name = "placed_ttl")
	@JsonProperty("Total Placed")
	private String TotalPlaced;

}
