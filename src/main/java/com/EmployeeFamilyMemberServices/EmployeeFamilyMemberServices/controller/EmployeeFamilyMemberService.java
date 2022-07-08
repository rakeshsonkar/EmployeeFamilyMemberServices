package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.DTO.EmployeeFamilyMemberServicesDTO;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Serviecs.EmployeeFamilyMemberServices;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Util.DataMapperUtil;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.requests.EmployeeFamilyMemberServicesRequest;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.response.ApiResponse;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.response.EmployeeFamilyResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmployeeFamilyMemberService {
	
	@Autowired
	private  EmployeeFamilyMemberServices employeeFamilyMemberServices;
	@PostMapping("EmployeeFamilyMemberService")
	ResponseEntity<ApiResponse<EmployeeFamilyResponse>> createEmployeeFamilyMemberService(@Validated @RequestBody final EmployeeFamilyMemberServicesRequest employeeFamilyMemberServicesRequest){
		log.info("geting  request in controller ",employeeFamilyMemberServicesRequest);
		
		EmployeeFamilyMemberServicesDTO employeeFamilyMemberServicesDTO = DataMapperUtil.converTo(employeeFamilyMemberServicesRequest,EmployeeFamilyMemberServicesDTO.class );
		log.info(" change  class employeeFamilyMemberServicesRequest to  employeeFamilyMemberServicesDTO   ",employeeFamilyMemberServicesDTO);
			employeeFamilyMemberServicesDTO =employeeFamilyMemberServices.create(employeeFamilyMemberServicesDTO);
		
		final EmployeeFamilyResponse employeeFamilyResponse =DataMapperUtil.converTo(employeeFamilyMemberServicesDTO, EmployeeFamilyResponse.class);
		return ResponseEntity.ok(ApiResponse.success(employeeFamilyResponse));
	}
	
	
			
}
