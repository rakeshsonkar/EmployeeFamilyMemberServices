package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.requests.EmployeeFamilyMemberServicesRequest;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.response.ApiResponse;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.response.EmployeeFamilyResponse;

@RestController
public class EmployeeFamilyMemberService {

	@PostMapping("EmployeeFamilyMemberService")
	ResponseEntity<ApiResponse<EmployeeFamilyResponse>> createEmployeeFamilyMemberService( @RequestBody final EmployeeFamilyMemberServicesRequest employeeFamilyMemberServicesRequest){
		
		return null;
	}
			
}
