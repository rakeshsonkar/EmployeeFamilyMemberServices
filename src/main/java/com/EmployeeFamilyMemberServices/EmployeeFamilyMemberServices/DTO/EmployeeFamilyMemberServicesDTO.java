package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.DTO;

import java.util.Date;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Gender;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.MaritalStatus;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.Relationship;

import lombok.Data;

@Data
public class EmployeeFamilyMemberServicesDTO {
	
	private Long id;
	private  Long empId;
	
	
	private String name;
	
	
	private Gender gender;
	
	private MaritalStatus maritalStatus;
	
	private  Relationship relationship;
	
	
	private String dob;
	
	
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
