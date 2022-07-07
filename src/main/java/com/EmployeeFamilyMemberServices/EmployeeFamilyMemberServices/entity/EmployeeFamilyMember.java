package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.entity;



import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Gender;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.MaritalStatus;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Relationship;

import lombok.Data;

@Entity
@Table(name="EMP_FAMILY_MEMBER")
@Data
public class EmployeeFamilyMember {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private  Long empId;
	
	@Column(name = "dob",nullable = false,length=100)
	private String name;
	
	@Column(nullable = false ,length=6)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(nullable = false ,length=50)
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	
	@Column(nullable = false ,length= 50)
	@Enumerated(EnumType.STRING)
	private  Relationship relationship;
	
	
	@Basic(optional = false)
	@Column(name = "dob", insertable= false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Basic(optional = false)
	private Boolean physicallyDisabled;
	
	@Basic(optional = false)
	private int percentageDisability;
	
//	@Column(name = "dependent", nullable = false, length = 1)
	@Basic(optional = false)
	private Boolean dependent;
	
	@Basic(optional = false)
	private Boolean nominee;
	
	@Basic(optional = false)
	private Boolean employed;
	
	@Column(length= 50)
	private String siNomination;
	
	@Column(length= 50)
	private String gratuityNomination;
	
	@Column(length= 50)
	private String gisNomination;
	
	@Column(length= 50)
	private String pfNomination;
	
	@Column(length= 50)
	private String gpfNomination;


}
