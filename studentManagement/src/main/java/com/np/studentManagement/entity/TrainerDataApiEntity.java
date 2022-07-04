package com.np.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "nsdc_trainer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainerDataApiEntity {

	@Id
	@Column(name = "nsdc_trainer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int nsdcTrainerId;

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
	
	@Column(name = "centre")
	@JsonProperty("Centre")
	private String Centre;
	
	@Column(name = "first_name")
	@JsonProperty("First Name")
	private String FirstName;
	
	@Column(name = "last_name")
	@JsonProperty("Last Name")
	@JsonIgnoreProperties
	private String LastName;
	
	@Column(name = "dob")
	@JsonProperty("DOB")
	private String DOB;
	
	@Column(name = "qualification")
	@JsonProperty("Qualification ")
	private String Qualification;
	
	@Column(name = "phone_number")
	@JsonProperty("Phone number ")
	private String PhoneNumber;
	
	@Column(name = "email_id")
	@JsonProperty("Email Id ")
	private String EmailId;
	
	@Column(name = "industry_experience_years")
	@JsonProperty("Industry Experience (No. of Years)")
	private String IndustryExperienceNoofYears;
	
	@Column(name = "doj")
	@JsonProperty("DOJ")
	private String DOJ;
	
	@Column(name = "training_experience_years")
	@JsonProperty("Training Experience (No. of Years)")
	private String TrainingExperienceNoOfYears;
	
	@Column(name = "crtf_sector")
	@JsonProperty("Sector")
	private String Sector;
	
	@Column(name = "crtf_trade")
	@JsonProperty("Trade")
	private String Trade;
	
	@Column(name = "crtf_by")
	@JsonProperty("Certified by")
	private String CertifiedBy;
	
	@Column(name = "crtf_valid_till")
	@JsonProperty("Certification Valid till")
	private String CertificationValidTill;
	
	@Column(name = "crtf_portal_data_uploaded")
	@JsonProperty("Certification Portal Data Uploaded")
	@JsonIgnoreProperties
	private String CertificationPortalDataUploaded;
	
	@Column(name = "remarks")
	@JsonProperty("Remarks")
	private String Remarks;

	public int getNsdcTrainerId() {
		return nsdcTrainerId;
	}

	public void setNsdcTrainerId(int nsdcTrainerId) {
		this.nsdcTrainerId = nsdcTrainerId;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getStateCode() {
		return StateCode;
	}

	public void setStateCode(String stateCode) {
		StateCode = stateCode;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getDistrictCode() {
		return DistrictCode;
	}

	public void setDistrictCode(String districtCode) {
		DistrictCode = districtCode;
	}

	public String getBlock() {
		return Block;
	}

	public void setBlock(String block) {
		Block = block;
	}

	public String getBlockCode() {
		return BlockCode;
	}

	public void setBlockCode(String blockCode) {
		BlockCode = blockCode;
	}

	public String getCentre() {
		return Centre;
	}

	public void setCentre(String centre) {
		Centre = centre;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getIndustryExperienceNoofYears() {
		return IndustryExperienceNoofYears;
	}

	public void setIndustryExperienceNoofYears(String industryExperienceNoofYears) {
		IndustryExperienceNoofYears = industryExperienceNoofYears;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String getTrainingExperienceNoOfYears() {
		return TrainingExperienceNoOfYears;
	}

	public void setTrainingExperienceNoOfYears(String trainingExperienceNoOfYears) {
		TrainingExperienceNoOfYears = trainingExperienceNoOfYears;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public String getTrade() {
		return Trade;
	}

	public void setTrade(String trade) {
		Trade = trade;
	}

	public String getCertifiedBy() {
		return CertifiedBy;
	}

	public void setCertifiedBy(String certifiedBy) {
		CertifiedBy = certifiedBy;
	}

	public String getCertificationValidTill() {
		return CertificationValidTill;
	}

	public void setCertificationValidTill(String certificationValidTill) {
		CertificationValidTill = certificationValidTill;
	}

	public String getCertificationPortalDataUploaded() {
		return CertificationPortalDataUploaded;
	}

	public void setCertificationPortalDataUploaded(String certificationPortalDataUploaded) {
		CertificationPortalDataUploaded = certificationPortalDataUploaded;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Block == null) ? 0 : Block.hashCode());
		result = prime * result + ((BlockCode == null) ? 0 : BlockCode.hashCode());
		result = prime * result + ((Centre == null) ? 0 : Centre.hashCode());
		result = prime * result
				+ ((CertificationPortalDataUploaded == null) ? 0 : CertificationPortalDataUploaded.hashCode());
		result = prime * result + ((CertificationValidTill == null) ? 0 : CertificationValidTill.hashCode());
		result = prime * result + ((CertifiedBy == null) ? 0 : CertifiedBy.hashCode());
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((DOJ == null) ? 0 : DOJ.hashCode());
		result = prime * result + ((District == null) ? 0 : District.hashCode());
		result = prime * result + ((DistrictCode == null) ? 0 : DistrictCode.hashCode());
		result = prime * result + ((EmailId == null) ? 0 : EmailId.hashCode());
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((IndustryExperienceNoofYears == null) ? 0 : IndustryExperienceNoofYears.hashCode());
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((PhoneNumber == null) ? 0 : PhoneNumber.hashCode());
		result = prime * result + ((Qualification == null) ? 0 : Qualification.hashCode());
		result = prime * result + ((Remarks == null) ? 0 : Remarks.hashCode());
		result = prime * result + ((Sector == null) ? 0 : Sector.hashCode());
		result = prime * result + ((State == null) ? 0 : State.hashCode());
		result = prime * result + ((StateCode == null) ? 0 : StateCode.hashCode());
		result = prime * result + ((Trade == null) ? 0 : Trade.hashCode());
		result = prime * result + ((TrainingExperienceNoOfYears == null) ? 0 : TrainingExperienceNoOfYears.hashCode());
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
		TrainerDataApiEntity other = (TrainerDataApiEntity) obj;
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
		if (Centre == null) {
			if (other.Centre != null)
				return false;
		} else if (!Centre.equals(other.Centre))
			return false;
		if (CertificationPortalDataUploaded == null) {
			if (other.CertificationPortalDataUploaded != null)
				return false;
		} else if (!CertificationPortalDataUploaded.equals(other.CertificationPortalDataUploaded))
			return false;
		if (CertificationValidTill == null) {
			if (other.CertificationValidTill != null)
				return false;
		} else if (!CertificationValidTill.equals(other.CertificationValidTill))
			return false;
		if (CertifiedBy == null) {
			if (other.CertifiedBy != null)
				return false;
		} else if (!CertifiedBy.equals(other.CertifiedBy))
			return false;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (DOJ == null) {
			if (other.DOJ != null)
				return false;
		} else if (!DOJ.equals(other.DOJ))
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
		if (EmailId == null) {
			if (other.EmailId != null)
				return false;
		} else if (!EmailId.equals(other.EmailId))
			return false;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (IndustryExperienceNoofYears == null) {
			if (other.IndustryExperienceNoofYears != null)
				return false;
		} else if (!IndustryExperienceNoofYears.equals(other.IndustryExperienceNoofYears))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (PhoneNumber == null) {
			if (other.PhoneNumber != null)
				return false;
		} else if (!PhoneNumber.equals(other.PhoneNumber))
			return false;
		if (Qualification == null) {
			if (other.Qualification != null)
				return false;
		} else if (!Qualification.equals(other.Qualification))
			return false;
		if (Remarks == null) {
			if (other.Remarks != null)
				return false;
		} else if (!Remarks.equals(other.Remarks))
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
		if (Trade == null) {
			if (other.Trade != null)
				return false;
		} else if (!Trade.equals(other.Trade))
			return false;
		if (TrainingExperienceNoOfYears == null) {
			if (other.TrainingExperienceNoOfYears != null)
				return false;
		} else if (!TrainingExperienceNoOfYears.equals(other.TrainingExperienceNoOfYears))
			return false;
		return true;
	}

	public TrainerDataApiEntity(int nsdcTrainerId, String state, String stateCode, String district, String districtCode,
			String block, String blockCode, String centre, String firstName, String lastName, String dOB,
			String qualification, String phoneNumber, String emailId, String industryExperienceNoofYears, String dOJ,
			String trainingExperienceNoOfYears, String sector, String trade, String certifiedBy,
			String certificationValidTill, String certificationPortalDataUploaded, String remarks) {
		super();
		this.nsdcTrainerId = nsdcTrainerId;
		State = state;
		StateCode = stateCode;
		District = district;
		DistrictCode = districtCode;
		Block = block;
		BlockCode = blockCode;
		Centre = centre;
		FirstName = firstName;
		LastName = lastName;
		DOB = dOB;
		Qualification = qualification;
		PhoneNumber = phoneNumber;
		EmailId = emailId;
		IndustryExperienceNoofYears = industryExperienceNoofYears;
		DOJ = dOJ;
		TrainingExperienceNoOfYears = trainingExperienceNoOfYears;
		Sector = sector;
		Trade = trade;
		CertifiedBy = certifiedBy;
		CertificationValidTill = certificationValidTill;
		CertificationPortalDataUploaded = certificationPortalDataUploaded;
		Remarks = remarks;
	}

	public TrainerDataApiEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TrainerDataApiEntity [nsdcTrainerId=" + nsdcTrainerId + ", State=" + State + ", StateCode=" + StateCode
				+ ", District=" + District + ", DistrictCode=" + DistrictCode + ", Block=" + Block + ", BlockCode="
				+ BlockCode + ", Centre=" + Centre + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DOB="
				+ DOB + ", Qualification=" + Qualification + ", PhoneNumber=" + PhoneNumber + ", EmailId=" + EmailId
				+ ", IndustryExperienceNoofYears=" + IndustryExperienceNoofYears + ", DOJ=" + DOJ
				+ ", TrainingExperienceNoOfYears=" + TrainingExperienceNoOfYears + ", Sector=" + Sector + ", Trade="
				+ Trade + ", CertifiedBy=" + CertifiedBy + ", CertificationValidTill=" + CertificationValidTill
				+ ", CertificationPortalDataUploaded=" + CertificationPortalDataUploaded + ", Remarks=" + Remarks + "]";
	}
	
	

}

