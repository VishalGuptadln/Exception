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
@Table(name = "nsdc_social_sector")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SocialSectorAPIEntity {

	
	@Column(name = "nsdc_social_sectr_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int nsdc_social_sectr_id;
	
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
	
	@Column(name = "financial_year")
	@JsonProperty("Financial Year")
	private String FinancialYear;
	
	@Column(name = "st_trained_male")
	@JsonProperty("ST Trained (male)")
	private String STTrainedMale;
	
	@Column(name = "sc_trained_male")
	@JsonProperty("SC Trained (male)")
	private String SCTrainedMale;
	
	@Column(name = "gnrl_trained_male")
	@JsonProperty("General Trained (male)")
	private String GeneralTrainedMale;
	
	@Column(name = "st_trained_female")
	@JsonProperty("ST Trained (female)")
	private String STTrainedFemale;
	
	@Column(name = "sc_trained_female")
	@JsonProperty("SC Trained (female)")
	private String SCTrainedFemale;
	
	@Column(name = "gnrl_trained_female")
	@JsonProperty("General Trained (female)")
	private String GeneralTrainedFemale;
	
	@Column(name = "st_trained_transgender")
	@JsonProperty("ST Trained (Transgender)")
	private String STTrainedTransgender;
	
	@Column(name = "sc_trained_transgender")
	@JsonProperty("SC Trained (Transgender)")
	private String SCTrainedTransgender;
	
	@Column(name = "gnrl_trained_transgender")
	@JsonProperty("General Trained (Transgender )")
	private String GeneralTrainedTransgender;
	
	@Column(name = "st_placed_male")
	@JsonProperty("ST Placed (male)")
	private String STPlacedMale;
	
	@Column(name = "sc_placed_male")
	@JsonProperty("SC Placed (male)")
	private String SCPlacedMale;
	
	@Column(name = "gnrl_placed_male")
	@JsonProperty("General Placed (male)")
	private String GeneralPlacedMale;
	
	@Column(name = "st_placed_female")
	@JsonProperty("ST Placed (female)")
	private String STPlacedFemale;
	
	@Column(name = "sc_placed_female")
	@JsonProperty("SC Placed (female)")
	private String SCPlacedFemale;
	
	@Column(name = "gnrl_placed_female")
	@JsonProperty("General Placed (female)")
	private String GeneralPlacedFemale;
	
	@Column(name = "st_placed_transgender")
	@JsonProperty("ST Placed (Transgender)")
	private String STPlacedTransgender;
	
	@Column(name = "sc_placed_transgender")
	@JsonProperty("SC Placed (Transgender)")
	private String SCPlacedTransgender;
	
	@Column(name = "gnrl_placed_transgender")
	@JsonProperty("General Placed (Transgender)")
	private String GeneralPlacedTransgender;
	
	@Column(name = "minority_trained_male")
	@JsonProperty("Minority Trained (male)")
	private String MinorityTrainedMale;
	
	@Column(name = "minority_trained_female")
	@JsonProperty("Minority Trained (female)")
	private String MinorityTrainedFemale;
	
	@Column(name = "minority_placed_male")
	@JsonProperty("Minority Placed (male)")
	private String MinorityPlacedMale;
	
	@Column(name = "minority_placed_female")
	@JsonProperty("Minority Placed (female)")
	private String MinorityPlacedFemale;
	
	@Column(name = "minority_placed_transgender")
	@JsonProperty("Minority Placed (Transgender)")
	private String MinorityPlacedTransgender;
	
	@Column(name = "minority_trained_transgender")
	@JsonProperty("Minority Trained (Transgender)")
	private String MinorityTrainedTransgender;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Block == null) ? 0 : Block.hashCode());
		result = prime * result + ((BlockCode == null) ? 0 : BlockCode.hashCode());
		result = prime * result + ((District == null) ? 0 : District.hashCode());
		result = prime * result + ((DistrictCode == null) ? 0 : DistrictCode.hashCode());
		result = prime * result + ((FinancialYear == null) ? 0 : FinancialYear.hashCode());
		result = prime * result + ((GeneralPlacedFemale == null) ? 0 : GeneralPlacedFemale.hashCode());
		result = prime * result + ((GeneralPlacedMale == null) ? 0 : GeneralPlacedMale.hashCode());
		result = prime * result + ((GeneralPlacedTransgender == null) ? 0 : GeneralPlacedTransgender.hashCode());
		result = prime * result + ((GeneralTrainedFemale == null) ? 0 : GeneralTrainedFemale.hashCode());
		result = prime * result + ((GeneralTrainedMale == null) ? 0 : GeneralTrainedMale.hashCode());
		result = prime * result + ((GeneralTrainedTransgender == null) ? 0 : GeneralTrainedTransgender.hashCode());
		result = prime * result + ((MinorityPlacedFemale == null) ? 0 : MinorityPlacedFemale.hashCode());
		result = prime * result + ((MinorityPlacedMale == null) ? 0 : MinorityPlacedMale.hashCode());
		result = prime * result + ((MinorityPlacedTransgender == null) ? 0 : MinorityPlacedTransgender.hashCode());
		result = prime * result + ((MinorityTrainedFemale == null) ? 0 : MinorityTrainedFemale.hashCode());
		result = prime * result + ((MinorityTrainedMale == null) ? 0 : MinorityTrainedMale.hashCode());
		result = prime * result + ((MinorityTrainedTransgender == null) ? 0 : MinorityTrainedTransgender.hashCode());
		result = prime * result + ((SCPlacedFemale == null) ? 0 : SCPlacedFemale.hashCode());
		result = prime * result + ((SCPlacedMale == null) ? 0 : SCPlacedMale.hashCode());
		result = prime * result + ((SCPlacedTransgender == null) ? 0 : SCPlacedTransgender.hashCode());
		result = prime * result + ((SCTrainedFemale == null) ? 0 : SCTrainedFemale.hashCode());
		result = prime * result + ((SCTrainedMale == null) ? 0 : SCTrainedMale.hashCode());
		result = prime * result + ((SCTrainedTransgender == null) ? 0 : SCTrainedTransgender.hashCode());
		result = prime * result + ((STPlacedFemale == null) ? 0 : STPlacedFemale.hashCode());
		result = prime * result + ((STPlacedMale == null) ? 0 : STPlacedMale.hashCode());
		result = prime * result + ((STPlacedTransgender == null) ? 0 : STPlacedTransgender.hashCode());
		result = prime * result + ((STTrainedFemale == null) ? 0 : STTrainedFemale.hashCode());
		result = prime * result + ((STTrainedMale == null) ? 0 : STTrainedMale.hashCode());
		result = prime * result + ((STTrainedTransgender == null) ? 0 : STTrainedTransgender.hashCode());
		result = prime * result + ((SchemeName == null) ? 0 : SchemeName.hashCode());
		result = prime * result + ((Sector == null) ? 0 : Sector.hashCode());
		result = prime * result + ((State == null) ? 0 : State.hashCode());
		result = prime * result + ((StateCode == null) ? 0 : StateCode.hashCode());
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
		SocialSectorAPIEntity other = (SocialSectorAPIEntity) obj;
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
		if (GeneralPlacedFemale == null) {
			if (other.GeneralPlacedFemale != null)
				return false;
		} else if (!GeneralPlacedFemale.equals(other.GeneralPlacedFemale))
			return false;
		if (GeneralPlacedMale == null) {
			if (other.GeneralPlacedMale != null)
				return false;
		} else if (!GeneralPlacedMale.equals(other.GeneralPlacedMale))
			return false;
		if (GeneralPlacedTransgender == null) {
			if (other.GeneralPlacedTransgender != null)
				return false;
		} else if (!GeneralPlacedTransgender.equals(other.GeneralPlacedTransgender))
			return false;
		if (GeneralTrainedFemale == null) {
			if (other.GeneralTrainedFemale != null)
				return false;
		} else if (!GeneralTrainedFemale.equals(other.GeneralTrainedFemale))
			return false;
		if (GeneralTrainedMale == null) {
			if (other.GeneralTrainedMale != null)
				return false;
		} else if (!GeneralTrainedMale.equals(other.GeneralTrainedMale))
			return false;
		if (GeneralTrainedTransgender == null) {
			if (other.GeneralTrainedTransgender != null)
				return false;
		} else if (!GeneralTrainedTransgender.equals(other.GeneralTrainedTransgender))
			return false;
		if (MinorityPlacedFemale == null) {
			if (other.MinorityPlacedFemale != null)
				return false;
		} else if (!MinorityPlacedFemale.equals(other.MinorityPlacedFemale))
			return false;
		if (MinorityPlacedMale == null) {
			if (other.MinorityPlacedMale != null)
				return false;
		} else if (!MinorityPlacedMale.equals(other.MinorityPlacedMale))
			return false;
		if (MinorityPlacedTransgender == null) {
			if (other.MinorityPlacedTransgender != null)
				return false;
		} else if (!MinorityPlacedTransgender.equals(other.MinorityPlacedTransgender))
			return false;
		if (MinorityTrainedFemale == null) {
			if (other.MinorityTrainedFemale != null)
				return false;
		} else if (!MinorityTrainedFemale.equals(other.MinorityTrainedFemale))
			return false;
		if (MinorityTrainedMale == null) {
			if (other.MinorityTrainedMale != null)
				return false;
		} else if (!MinorityTrainedMale.equals(other.MinorityTrainedMale))
			return false;
		if (MinorityTrainedTransgender == null) {
			if (other.MinorityTrainedTransgender != null)
				return false;
		} else if (!MinorityTrainedTransgender.equals(other.MinorityTrainedTransgender))
			return false;
		if (SCPlacedFemale == null) {
			if (other.SCPlacedFemale != null)
				return false;
		} else if (!SCPlacedFemale.equals(other.SCPlacedFemale))
			return false;
		if (SCPlacedMale == null) {
			if (other.SCPlacedMale != null)
				return false;
		} else if (!SCPlacedMale.equals(other.SCPlacedMale))
			return false;
		if (SCPlacedTransgender == null) {
			if (other.SCPlacedTransgender != null)
				return false;
		} else if (!SCPlacedTransgender.equals(other.SCPlacedTransgender))
			return false;
		if (SCTrainedFemale == null) {
			if (other.SCTrainedFemale != null)
				return false;
		} else if (!SCTrainedFemale.equals(other.SCTrainedFemale))
			return false;
		if (SCTrainedMale == null) {
			if (other.SCTrainedMale != null)
				return false;
		} else if (!SCTrainedMale.equals(other.SCTrainedMale))
			return false;
		if (SCTrainedTransgender == null) {
			if (other.SCTrainedTransgender != null)
				return false;
		} else if (!SCTrainedTransgender.equals(other.SCTrainedTransgender))
			return false;
		if (STPlacedFemale == null) {
			if (other.STPlacedFemale != null)
				return false;
		} else if (!STPlacedFemale.equals(other.STPlacedFemale))
			return false;
		if (STPlacedMale == null) {
			if (other.STPlacedMale != null)
				return false;
		} else if (!STPlacedMale.equals(other.STPlacedMale))
			return false;
		if (STPlacedTransgender == null) {
			if (other.STPlacedTransgender != null)
				return false;
		} else if (!STPlacedTransgender.equals(other.STPlacedTransgender))
			return false;
		if (STTrainedFemale == null) {
			if (other.STTrainedFemale != null)
				return false;
		} else if (!STTrainedFemale.equals(other.STTrainedFemale))
			return false;
		if (STTrainedMale == null) {
			if (other.STTrainedMale != null)
				return false;
		} else if (!STTrainedMale.equals(other.STTrainedMale))
			return false;
		if (STTrainedTransgender == null) {
			if (other.STTrainedTransgender != null)
				return false;
		} else if (!STTrainedTransgender.equals(other.STTrainedTransgender))
			return false;
		if (SchemeName == null) {
			if (other.SchemeName != null)
				return false;
		} else if (!SchemeName.equals(other.SchemeName))
			return false;
		if (Sector == null) {
			if (other.Sector != null)
				return false;
		} else if (!Sector.equals(other.Sector))
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
		return true;
	}
	
	

}
