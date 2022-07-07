package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeFamilyMemberServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeFamilyMemberServicesApplication.class, args);
	}

}

//id number(19,0) not null,
//nominee varchar2(255 char),
//dependent varchar2(255 char),
//dob timestamp not null,
//emp_id number(19,0),
//employed varchar2(255 char),
//gender number(10,0),
//marital_status number(10,0),
//name varchar2(255 char),
//percentage_of_disability varchar2(255 char),
//physically_disabled varchar2(255 char),
//relationship number(10,0),
//primary key (id)
