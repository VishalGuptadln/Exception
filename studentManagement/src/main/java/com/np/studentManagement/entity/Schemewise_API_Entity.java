package com.np.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "nsdc_schemewise")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Schemewise_API_Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false)
	private int nsdc_schemew_id;
	
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
	
	@Column(name = "financial_year")
	@JsonProperty("Financial Year")
	private String FinancialYear;
	
	@Column(name = "trained_male")
	@JsonProperty("Trained (male)")
	private String Trained_male;
	
	@Column(name = "placed_male")
	@JsonProperty("Placed (male)")
	private String Placed_male;
	
	@Column(name = "self_employed_male")
	@JsonProperty("Self Employed (male)")
	private String SelfEmployed_male;
	
	@Column(name = "avg_salary_male")
	@JsonProperty("Avg Salary (male)")
	private String AvgSalary_male;
	
	@Column(name = "trained_female")
	@JsonProperty("Trained (female)")
	private String Trained_female;
	
	@Column(name = "placed_female")
	@JsonProperty("Placed (female)")
	private String Placed_female;
	
	@Column(name = "self_employed_female")
	@JsonProperty("Self Employed  (female)")
	private String SelfEmployed__female;
	
	@Column(name = "avg_salary_female")
	@JsonProperty("Avg Salary (female)")
	private String AvgSalary_female;
	
	@Column(name = "trained_transgndr")
	@JsonProperty("Trained (transgender) ")
	private String Trained_transgender;
	
	@Column(name = "placed_transgndr")
	@JsonProperty("Placed (transgender)")
	private String Placed_transgender;
	
	@Column(name = "self_employed_transgndr")
	@JsonProperty("Self Employed (transgender)")
	private String SelfEmployed_transgender;
	
	@Column(name = "avg_salary_transgndr")
	@JsonProperty("Avg Salary (transgender)")
	private String AvgSalaryTransgender;
	
	@Column(name = "trained_ttl")
	@JsonProperty("Total Trained")
	private String TotalTrained;
	
	@Column(name = "placed_ttl")
	@JsonProperty("Total Placed ")
	private String TotalPlaced;
	
	@Column(name = "self_employed_ttl")
	@JsonProperty("Total Self Employed ")
	private String TotalSelfEmployed;
	
	@Column(name = "avg_salary_ttl")
	@JsonProperty("Total Avg Salary")
	private String TotalAvgSalary;
	//String last_updated;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AvgSalaryTransgender == null) ? 0 : AvgSalaryTransgender.hashCode());
		result = prime * result + ((AvgSalary_female == null) ? 0 : AvgSalary_female.hashCode());
		result = prime * result + ((AvgSalary_male == null) ? 0 : AvgSalary_male.hashCode());
		result = prime * result + ((Block == null) ? 0 : Block.hashCode());
		result = prime * result + ((BlockCode == null) ? 0 : BlockCode.hashCode());
		result = prime * result + ((District == null) ? 0 : District.hashCode());
		result = prime * result + ((DistrictCode == null) ? 0 : DistrictCode.hashCode());
		result = prime * result + ((FinancialYear == null) ? 0 : FinancialYear.hashCode());
		result = prime * result + ((Placed_female == null) ? 0 : Placed_female.hashCode());
		result = prime * result + ((Placed_male == null) ? 0 : Placed_male.hashCode());
		result = prime * result + ((Placed_transgender == null) ? 0 : Placed_transgender.hashCode());
		result = prime * result + ((SchemeName == null) ? 0 : SchemeName.hashCode());
		result = prime * result + ((SelfEmployed__female == null) ? 0 : SelfEmployed__female.hashCode());
		result = prime * result + ((SelfEmployed_male == null) ? 0 : SelfEmployed_male.hashCode());
		result = prime * result + ((SelfEmployed_transgender == null) ? 0 : SelfEmployed_transgender.hashCode());
		result = prime * result + ((State == null) ? 0 : State.hashCode());
		result = prime * result + ((StateCode == null) ? 0 : StateCode.hashCode());
		result = prime * result + ((TotalAvgSalary == null) ? 0 : TotalAvgSalary.hashCode());
		result = prime * result + ((TotalPlaced == null) ? 0 : TotalPlaced.hashCode());
		result = prime * result + ((TotalSelfEmployed == null) ? 0 : TotalSelfEmployed.hashCode());
		result = prime * result + ((TotalTrained == null) ? 0 : TotalTrained.hashCode());
		result = prime * result + ((Trained_female == null) ? 0 : Trained_female.hashCode());
		result = prime * result + ((Trained_male == null) ? 0 : Trained_male.hashCode());
		result = prime * result + ((Trained_transgender == null) ? 0 : Trained_transgender.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schemewise_API_Entity other = (Schemewise_API_Entity) obj;
		if (AvgSalaryTransgender == null) {
			if (other.AvgSalaryTransgender != null)
				return false;
		} else if (!AvgSalaryTransgender.equals(other.AvgSalaryTransgender))
			return false;
		if (AvgSalary_female == null) {
			if (other.AvgSalary_female != null)
				return false;
		} else if (!AvgSalary_female.equals(other.AvgSalary_female))
			return false;
		if (AvgSalary_male == null) {
			if (other.AvgSalary_male != null)
				return false;
		} else if (!AvgSalary_male.equals(other.AvgSalary_male))
			return false;
		if (Block == null) {
			if (other.Block != null)
				return false;
		} else if (!Block.equals(other.Block))
			return false;
		if (BlockCode == null) {
			if (other.BlockCode != null)
				return false;
		} else if (!BlockCode.equals(other.BlockCode))
			return false;
		if (District == null) {
			if (other.District != null)
				return false;
		} else if (!District.equals(other.District))
			return false;
		if (DistrictCode == null) {
			if (other.DistrictCode != null)
				return false;
		} else if (!DistrictCode.equals(other.DistrictCode))
			return false;
		if (FinancialYear == null) {
			if (other.FinancialYear != null)
				return false;
		} else if (!FinancialYear.equals(other.FinancialYear))
			return false;
		if (Placed_female == null) {
			if (other.Placed_female != null)
				return false;
		} else if (!Placed_female.equals(other.Placed_female))
			return false;
		if (Placed_male == null) {
			if (other.Placed_male != null)
				return false;
		} else if (!Placed_male.equals(other.Placed_male))
			return false;
		if (Placed_transgender == null) {
			if (other.Placed_transgender != null)
				return false;
		} else if (!Placed_transgender.equals(other.Placed_transgender))
			return false;
		if (SchemeName == null) {
			if (other.SchemeName != null)
				return false;
		} else if (!SchemeName.equals(other.SchemeName))
			return false;
		if (SelfEmployed__female == null) {
			if (other.SelfEmployed__female != null)
				return false;
		} else if (!SelfEmployed__female.equals(other.SelfEmployed__female))
			return false;
		if (SelfEmployed_male == null) {
			if (other.SelfEmployed_male != null)
				return false;
		} else if (!SelfEmployed_male.equals(other.SelfEmployed_male))
			return false;
		if (SelfEmployed_transgender == null) {
			if (other.SelfEmployed_transgender != null)
				return false;
		} else if (!SelfEmployed_transgender.equals(other.SelfEmployed_transgender))
			return false;
		if (State == null) {
			if (other.State != null)
				return false;
		} else if (!State.equals(other.State))
			return false;
		if (StateCode == null) {
			if (other.StateCode != null)
				return false;
		} else if (!StateCode.equals(other.StateCode))
			return false;
		if (TotalAvgSalary == null) {
			if (other.TotalAvgSalary != null)
				return false;
		} else if (!TotalAvgSalary.equals(other.TotalAvgSalary))
			return false;
		if (TotalPlaced == null) {
			if (other.TotalPlaced != null)
				return false;
		} else if (!TotalPlaced.equals(other.TotalPlaced))
			return false;
		if (TotalSelfEmployed == null) {
			if (other.TotalSelfEmployed != null)
				return false;
		} else if (!TotalSelfEmployed.equals(other.TotalSelfEmployed))
			return false;
		if (TotalTrained == null) {
			if (other.TotalTrained != null)
				return false;
		} else if (!TotalTrained.equals(other.TotalTrained))
			return false;
		if (Trained_female == null) {
			if (other.Trained_female != null)
				return false;
		} else if (!Trained_female.equals(other.Trained_female))
			return false;
		if (Trained_male == null) {
			if (other.Trained_male != null)
				return false;
		} else if (!Trained_male.equals(other.Trained_male))
			return false;
		if (Trained_transgender == null) {
			if (other.Trained_transgender != null)
				return false;
		} else if (!Trained_transgender.equals(other.Trained_transgender))
			return false;
		return true;
	}

	
	

}
