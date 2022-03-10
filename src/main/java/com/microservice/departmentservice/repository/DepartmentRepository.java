package com.microservice.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.departmentservice.entity.Department;

@org.springframework.stereotype.Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);

}
