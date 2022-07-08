package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.entity.EmployeeFamilyMember;

@Repository
public interface EmployeeFamilyMemberRepository extends JpaRepository<EmployeeFamilyMember, Long> {

}
