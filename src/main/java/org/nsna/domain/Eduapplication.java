package org.nsna.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


import org.nsna.serializers.JsonDateTimeDeserializer;
import org.nsna.serializers.JsonDateTimeSerializer;

import org.nsna.serializers.JsonDateDeserializer;
import org.nsna.serializers.JsonDateSerializer;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Eduapplication generated by hbm2java
 */
@Entity
@Table(name = "EDUAPPLICATION", schema = "PUBLIC")
@NamedEntityGraphs({
    @NamedEntityGraph(
        name = "EduApplWithProcessDetail",
        attributeNodes = {
            @NamedAttributeNode("eduappProcessDetail")
        }
    )})
public class Eduapplication implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2490498371217372695L;
	/**
	 * 
	 */

	
	private Long id;
	private String applicationYear;
	private String studentId;
	private String confirmationNmbr;
	private String lastName;
	private String firstName;
	private Date birthdate;
	private Character gender;
	private String fathersName;
	private String mothersName;
	private String fatherOccupation;
	private String motherOccupation;	
	private Short brothersCount;
	private Short sistersCount;
	private Short siblingsInSchool;
	private String nativeVillage;
	private String kovilPirivu;
	private String email;
	private String phone1;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pin;
	private String institutionName;
	private String degree;
	private String specialization;
	private String collegeYear;
	private BigDecimal recentAggregatePercent;
	private String recentAggregateIn;
	private Integer annualTuitionFee;
	private Integer annualFamilyIncome;
	private String referenceName;
	private String referencePhone;
	private String checkToName;	
	private Character acknowledgement;
	private Date crTs;
	private String remoteAddress;
	private String userName;
	private String accountHolderName;
	private String accountNumber;
	private String bankName;
	private String branchName;
	private String branchIfscCode;
	private String bankSwiftCode;
	private String branchAddressLine1;
	private String branchAddressLine2;
	private String branchAddressLine3;	
	private Character phoneTypeMobile;	
	private String institutionCity;
	private String otherScholarships;	
	private String universityName;
	private String universityRegisterNmbr;	
	private Set<EduappAttachment> eduappAttachments = new HashSet<EduappAttachment>(0);
	private EduappProcessDetail eduappProcessDetail;

	public Eduapplication() {
	}

	public Eduapplication(String studentId, String applicationYear, String confirmationNmbr, String lastName, String firstName, Date birthdate,
			Character gender, String fathersName, String mothersName,
			String fatherOccupation, String motherOccupation,
			Short brothersCount, Short sistersCount,
			Short siblingsInSchool, String nativeVillage, String kovilPirivu, String email, String phone1,
			String addressLine1, String addressLine2, String city, String pin, String institutionName, String degree,
			String specialization, String collegeYear, BigDecimal recentAggregatePercent, String recentAggregateIn,
			Integer annualTuitionFee, Integer annualFamilyIncome, String referenceName, String referencePhone, String checkToName,
			Character acknowledgement, Date crTs, String remoteAddress, String userName, String accountHolderName,
			String accountNumber, String bankName, String branchName, String branchIfscCode,
			String bankSwiftCode, String branchAddressLine1, String branchAddressLine2, String branchAddressLine3,
			Character phoneTypeMobile, String institutionCity, String otherScholarships,
			String universityName, String universityRegisterNmbr,
			Set<EduappAttachment> eduappAttachments, EduappProcessDetail eduappProcessDetail) {
		this.studentId = studentId;
		this.applicationYear = applicationYear;
		this.confirmationNmbr = confirmationNmbr;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthdate = birthdate;
		this.gender = gender;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.setFatherOccupation(fatherOccupation);
		this.setMotherOccupation(motherOccupation);		
		this.brothersCount = brothersCount;
		this.sistersCount = sistersCount;
		this.siblingsInSchool = siblingsInSchool;
		this.nativeVillage = nativeVillage;
		this.kovilPirivu = kovilPirivu;
		this.email = email;
		this.phone1 = phone1;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pin = pin;
		this.institutionName = institutionName;
		this.degree = degree;
		this.specialization = specialization;
		this.collegeYear = collegeYear;
		this.recentAggregatePercent = recentAggregatePercent;
		this.recentAggregateIn = recentAggregateIn;
		this.annualTuitionFee = annualTuitionFee;
		this.annualFamilyIncome = annualFamilyIncome;
		this.referenceName = referenceName;
		this.referencePhone = referencePhone;
		this.checkToName = checkToName;		
		this.acknowledgement = acknowledgement;
		this.crTs = crTs;
		this.remoteAddress = remoteAddress;
		this.userName = userName;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.branchName = branchName;
		this.branchIfscCode = branchIfscCode;
		this.setBankSwiftCode(bankSwiftCode);
		this.setBranchAddressLine1(branchAddressLine1);
		this.setBranchAddressLine2(branchAddressLine2);
		this.setBranchAddressLine3(branchAddressLine3);
		this.phoneTypeMobile = phoneTypeMobile;	
		this.institutionCity = institutionCity;
		this.otherScholarships = otherScholarships;		
		this.universityName = universityName;
		this.universityRegisterNmbr = universityRegisterNmbr;		
		this.eduappAttachments = eduappAttachments;
		this.eduappProcessDetail = eduappProcessDetail;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	@Column(name = "APPLICATION_YEAR", length = 4)
	public String getApplicationYear() {
		return applicationYear;
	}

	public void setApplicationYear(String applicationYear) {
		this.applicationYear = applicationYear;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "STUDENT_ID", length = 10)
	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Column(name = "CONFIRMATION_NMBR", length = 20)
	public String getConfirmationNmbr() {
		return this.confirmationNmbr;
	}

	public void setConfirmationNmbr(String confirmationNmbr) {
		this.confirmationNmbr = confirmationNmbr;
	}

	@Column(name = "LAST_NAME", length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "FIRST_NAME", length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDATE", length = 8)
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getBirthdate() {
		return this.birthdate;
	}

	@JsonDeserialize(using=JsonDateDeserializer.class)
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "GENDER", length = 1)
	public Character getGender() {
		return this.gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	@Column(name = "FATHERS_NAME", length = 50)
	public String getFathersName() {
		return this.fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	@Column(name = "MOTHERS_NAME", length = 50)
	public String getMothersName() {
		return this.mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	@Column(name = "FATHER_OCCUPATION", length = 40)	
	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	@Column(name = "MOTHER_OCCUPATION", length = 40)		
	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}	
	
	
	@Column(name = "BROTHERS_COUNT")
	public Short getBrothersCount() {
		return this.brothersCount;
	}

	public void setBrothersCount(Short brothersCount) {
		this.brothersCount = brothersCount;
	}

	@Column(name = "SISTERS_COUNT")
	public Short getSistersCount() {
		return this.sistersCount;
	}

	public void setSistersCount(Short sistersCount) {
		this.sistersCount = sistersCount;
	}

	@Column(name = "SIBLINGS_IN_SCHOOL")
	public Short getSiblingsInSchool() {
		return this.siblingsInSchool;
	}

	public void setSiblingsInSchool(Short siblingsInSchool) {
		this.siblingsInSchool = siblingsInSchool;
	}

	@Column(name = "NATIVE_VILLAGE", length = 80)
	public String getNativeVillage() {
		return this.nativeVillage;
	}

	public void setNativeVillage(String nativeVillage) {
		this.nativeVillage = nativeVillage;
	}

	@Column(name = "KOVIL_PIRIVU", length = 80)
	public String getKovilPirivu() {
		return this.kovilPirivu;
	}

	public void setKovilPirivu(String kovilPirivu) {
		this.kovilPirivu = kovilPirivu;
	}

	@Column(name = "EMAIL", length = 60)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PHONE1", length = 13)
	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	@Column(name = "ADDRESS_LINE1", length = 50)
	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	@Column(name = "ADDRESS_LINE2", length = 50)
	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@Column(name = "CITY", length = 30)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "PIN", length = 6)
	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Column(name = "INSTITUTION_NAME", length = 75)
	public String getInstitutionName() {
		return this.institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	@Column(name = "DEGREE", length = 30)
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "SPECIALIZATION", length = 50)
	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Column(name = "COLLEGE_YEAR", length = 4)
	public String getCollegeYear() {
		return this.collegeYear;
	}

	public void setCollegeYear(String collegeYear) {
		this.collegeYear = collegeYear;
	}

	@Column(name = "RECENT_AGGREGATE_PERCENT")
	public BigDecimal getRecentAggregatePercent() {
		return this.recentAggregatePercent;
	}

	public void setRecentAggregatePercent(BigDecimal recentAggregatePercent) {
		this.recentAggregatePercent = recentAggregatePercent;
	}

	@Column(name = "RECENT_AGGREGATE_IN", length = 15)
	public String getRecentAggregatein() {
		return this.recentAggregateIn;
	}

	public void setRecentAggregatein(String recentAggregatein) {
		this.recentAggregateIn = recentAggregatein;
	}

	@Column(name = "ANNUAL_TUITION_FEE")
	public Integer getAnnualTuitionFee() {
		return this.annualTuitionFee;
	}

	public void setAnnualTuitionFee(Integer annualTuitionFee) {
		this.annualTuitionFee = annualTuitionFee;
	}

	@Column(name = "ANNUAL_FAMILY_INCOME")
	public Integer getAnnualFamilyIncome() {
		return this.annualFamilyIncome;
	}

	public void setAnnualFamilyIncome(Integer annualFamilyIncome) {
		this.annualFamilyIncome = annualFamilyIncome;
	}

	@Column(name = "REFERENCE_NAME", length = 30)
	public String getReferenceName() {
		return this.referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	@Column(name = "REFERENCE_PHONE", length = 10)
	public String getReferencePhone() {
		return this.referencePhone;
	}

	public void setReferencePhone(String referencePhone) {
		this.referencePhone = referencePhone;
	}
	
	@Column(name = "CHECK_TO_NAME", length = 40)
	public String getCheckToName() {
		return this.checkToName;
	}

	public void setCheckToName(String checkToName) {
		this.checkToName = checkToName;
	}	

	@Column(name = "ACKNOWLEDGEMENT")
	public Character getAcknowledgement() {
		return this.acknowledgement;
	}

	public void setAcknowledgement(Character acknowledgement) {
		this.acknowledgement = acknowledgement;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CR_TS", length = 23)
	@JsonSerialize(using=JsonDateTimeSerializer.class)
	public Date getCrTs() {
		return this.crTs;
	}

	@JsonDeserialize(using=JsonDateTimeDeserializer.class)
	public void setCrTs(Date crTs) {
		this.crTs = crTs;
	}
	
	@Column(name = "REMOTE_ADDRESS", length = 40)
	public String getRemoteAddress() {
		return this.remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}
	
	@Column(name = "USER_NAME", length = 25)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	

	@Column(name = "ACCOUNT_HOLDER_NAME", length = 50)
	public String getAccountHolderName() {
		return this.accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Column(name = "ACCOUNT_NUMBER", length = 30)
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Column(name = "BANK_NAME", length = 50)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "BRANCH_NAME", length = 40)
	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Column(name = "BRANCH_IFSC_CODE", length = 25)
	public String getBranchIfscCode() {
		return this.branchIfscCode;
	}

	public void setBranchIfscCode(String branchIfscCode) {
		this.branchIfscCode = branchIfscCode;
	}
	
	@Column(name = "BANK_SWIFT_CODE", length = 25)	
	public String getBankSwiftCode() {
		return bankSwiftCode;
	}

	public void setBankSwiftCode(String bankSwiftCode) {
		this.bankSwiftCode = bankSwiftCode;
	}

	@Column(name = "BRANCH_ADDRESS_LINE1", length = 35)	
	public String getBranchAddressLine1() {
		return branchAddressLine1;
	}

	public void setBranchAddressLine1(String branchAddressLine1) {
		this.branchAddressLine1 = branchAddressLine1;
	}

	@Column(name = "BRANCH_ADDRESS_LINE2", length = 35)	
	public String getBranchAddressLine2() {
		return branchAddressLine2;
	}

	public void setBranchAddressLine2(String branchAddressLine2) {
		this.branchAddressLine2 = branchAddressLine2;
	}

	@Column(name = "BRANCH_ADDRESS_LINE3", length = 35)	
	public String getBranchAddressLine3() {
		return branchAddressLine3;
	}

	public void setBranchAddressLine3(String branchAddressLine3) {
		this.branchAddressLine3 = branchAddressLine3;
	}

	@Column(name = "PHONE_TYPE_MOBILE")
	public Character getPhoneTypeMobile() {
		return this.phoneTypeMobile;
	}

	public void setPhoneTypeMobile(Character phoneTypeMobile) {
		this.phoneTypeMobile = phoneTypeMobile;
	}	

	@Column(name = "INSTITUTION_CITY", length = 30)
	public String getInstitutionCity() {
		return this.institutionCity;
	}

	public void setInstitutionCity(String institutionCity) {
		this.institutionCity = institutionCity;
	}

	@Column(name = "OTHER_SCHOLARSHIPS", length = 300)
	public String getOtherScholarships() {
		return this.otherScholarships;
	}

	public void setOtherScholarships(String otherScholarships) {
		this.otherScholarships = otherScholarships;
	}	
	
	@Column(name = "UNIVERSITY_NAME", length = 60)
	public String getUniversityName() {
		return this.universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Column(name = "UNIVERSITY_REGISTER_NMBR", length = 15)
	public String getUniversityRegisterNmbr() {
		return this.universityRegisterNmbr;
	}

	public void setUniversityRegisterNmbr(String universityRegisterNmbr) {
		this.universityRegisterNmbr = universityRegisterNmbr;
	}	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eduapplication", cascade = CascadeType.ALL)
	@JsonManagedReference
	public Set<EduappAttachment> getEduappAttachments() {
		return this.eduappAttachments;
	}

	public void setEduappAttachments(Set<EduappAttachment> eduappAttachments) {
		this.eduappAttachments = eduappAttachments;
	}

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "eduapplication" , cascade = CascadeType.ALL)
//Spring Data ingnores the FetchMode. So FetchMode does not work. Use EntityGraph instead	
//	@Fetch(FetchMode.JOIN)
	@JsonManagedReference
	public EduappProcessDetail getEduappProcessDetail() {
		return this.eduappProcessDetail;
	}

	public void setEduappProcessDetail(EduappProcessDetail eduappProcessDetail) {
		this.eduappProcessDetail = eduappProcessDetail;
	}
	
	  @PrePersist
	  void createdAt() {
	    this.crTs = new Date();
	  }	
	  
	  @Transient
	  public long getMarksheet1AttachmentId() {
		  for (EduappAttachment attachment : getEduappAttachments()){
			  if (attachment.getDocumentCategory().equals("markSheet1")) return attachment.getId();
		  }
		  return -1;
	  }
	  
	  public void setMarksheet1AttachmentId(long id) {
		  
	  }
	  
	  @Transient
	  public long getMarksheet2AttachmentId() {
		  for (EduappAttachment attachment : getEduappAttachments()){
			  if (attachment.getDocumentCategory().equals("markSheet2")) return attachment.getId();
		  }
		  return -1;
	  }
	  
	  public void setMarksheet2AttachmentId(long id) {
		  
	  }	  
	  
	  @Transient
	  public long getTuitionReceipt1AttachmentId() {
		  for (EduappAttachment attachment : getEduappAttachments()){
			  if (attachment.getDocumentCategory().equals("tuitionReceipt1")) return attachment.getId();
		  }
		  return -1;
	  }
	  
	  public void setTuitionReceipt1AttachmentId(long id) {
		  
	  }	  
	  
	  @Transient
	  public long getTuitionReceipt2AttachmentId() {
		  for (EduappAttachment attachment : getEduappAttachments()){
			  if (attachment.getDocumentCategory().equals("tuitionReceipt2")) return attachment.getId();
		  }
		  return -1;
	  }
	  
	  public void setTuitionReceipt2AttachmentId(long id) {
		  
	  }		  
	  
	  @Transient
	  public long getIncomeProofAttachmentId() {
		  for (EduappAttachment attachment : getEduappAttachments()){
			  if (attachment.getDocumentCategory().equals("incomeProof")) return attachment.getId();
		  }
		  return -1;
	  }
	  
  
	  public void setIncomeProofAttachmentId(long id) {
	  }
	  
	  @Transient
	  public long getNagaratharProofAttachmentId() {
		  for (EduappAttachment attachment : getEduappAttachments()){
			  if (attachment.getDocumentCategory().equals("nagaratharProof")) return attachment.getId();
		  }
		  return -1;
	  }	  
	  
	  public void setNagaratharProofAttachmentId(long id) {
	  }	  
	  
	  @Transient
	  public long getScholarshipLetterAttachmentId() {
		  for (EduappAttachment attachment : getEduappAttachments()){
			  if (attachment.getDocumentCategory().equals("scholarshipLetter")) return attachment.getId();
		  }
		  return -1;
	  }	  
	  
	  public void setScholarshipLetterAttachmentId(long id) {
	  }


}
