package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.requests;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Gender;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.MaritalStatus;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Relationship;

import lombok.Data;

@Data
public class EmployeeFamilyMemberServicesRequest {
	
	@NotEmpty(message = "The Emp_id is required.")
	private  Long empId;
	
	@NotEmpty(message = "The Name is required.")
	@Size(max=100)
	private String name;
	
	@NotEmpty(message = "The gender is required.")
	private Gender gender;
	
	private MaritalStatus maritalStatus;
	
	private  Relationship relationship;
	
	@NotNull(message = "The date of birth is required.")
	private Date dob;
	
	@NotNull(message = "The date of birth is required.")
	private Boolean physicallyDisabled;
	
	private int percentageDisability;
	
	private Boolean dependent;
	
	private Boolean employed;
	
	private Boolean nominee;
	
	private String siNomination;
	
	private String gratuityNomination;
	
	private String gisNomination;
	
	private String pfNomination;
	
	private String gpfNomination;
	
}
