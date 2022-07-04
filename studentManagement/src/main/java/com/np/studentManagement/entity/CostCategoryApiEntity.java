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
@Table(name = "nsdc_cost_category")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CostCategoryApiEntity {

		@Id
		@Column(name = "nsdc_costcatg_id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int nsdcCostcatgId;
		
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
		
		@Column(name = "total_duration")
		@JsonProperty("Total Duration")
		private String TotalDuration;
		
		@Column(name = "cost_category_as_per_ccn")
		@JsonProperty("Cost Category as per CCN")
		private String CostCategoryasperCCN;
		
		@Column(name = "financial_year")
		@JsonProperty("Financial Year")
		private String FinancialYear;
		
		@Column(name = "trained")
		@JsonProperty("Trained")
		private String Trained;
		
		@Column(name = "placed")
		@JsonProperty("Placed")
		private String Placed;
		
		@Column(name = "avg_salary")
		@JsonProperty("Avg Salary")
		private String AvgSalary;
}
