package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.requests;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Gender;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.MaritalStatus;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Relationship;

import lombok.Data;

@Data
public class EmployeeFamilyMemberServicesRequest {
	
	 @NotNull(message = "Please enter empid")
	private  Long empId;
	
	 @NotEmpty(message = "Please enter name")
	@Size(max=100)
	private String name;
	
	 @NotNull(message = "Please enter gender")
	private Gender gender;
	
	private MaritalStatus maritalStatus;
	
	private  Relationship relationship;
	
	
//	@DateTimeFormat(pattern = "dd-mm-yyyy")
	private String dob;
	
	@NotNull(message = "The date of birth is required.")
	private Boolean physicallyDisabled;
	
	@NotNull(message = "The percentageDisability is required.")
	private int percentageDisability;
	
	@NotNull(message = "The dependent is required.")
	private Boolean dependent;
	
	@NotNull(message = "The employed is required.")
	private Boolean employed;
	
	@NotNull(message = "The nominee is required.")
	private Boolean nominee;
	
	private String siNomination;
	
	private String gratuityNomination;
	
	private String gisNomination;
	
	private String pfNomination;
	
	private String gpfNomination;
	
}
