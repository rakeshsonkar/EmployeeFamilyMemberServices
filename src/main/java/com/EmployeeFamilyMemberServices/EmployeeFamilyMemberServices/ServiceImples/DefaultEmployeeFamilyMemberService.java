package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.ServiceImples;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.DTO.EmployeeFamilyMemberServicesDTO;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Repositories.EmployeeFamilyMemberRepository;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Serviecs.EmployeeFamilyMemberServices;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Util.DataMapperUtil;
import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.entity.EmployeeFamilyMember;

@Service
public class DefaultEmployeeFamilyMemberService implements EmployeeFamilyMemberServices {
	
	@Autowired
	private EmployeeFamilyMemberRepository employeeFamilyMemberRepository;
	@Override
	public EmployeeFamilyMemberServicesDTO create(final EmployeeFamilyMemberServicesDTO employeeFamilyMemberServicesDTO) {
		 EmployeeFamilyMember employeeFamilyMember = DataMapperUtil.converTo(employeeFamilyMemberServicesDTO,EmployeeFamilyMember.class );
		
		employeeFamilyMember=employeeFamilyMemberRepository.save(employeeFamilyMember);
		
		final EmployeeFamilyMemberServicesDTO createemployeeFamilyMemberServicesDTO= DataMapperUtil.converTo(employeeFamilyMember, EmployeeFamilyMemberServicesDTO.class);
		
		return createemployeeFamilyMemberServicesDTO;
	}

}
