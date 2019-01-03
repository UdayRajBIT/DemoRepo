package com.vtg.SpringProject.DemoSpringRest.Repo;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;




	@Repository
	@Transactional
	@RepositoryRestResource(collectionResourceRel = "EmploymentType", path = "EmploymentType")
	public interface EmploymentTypeRepo extends CrudRepository<EmploymentType,Long>,JpaSpecificationExecutor<EmploymentType>,JpaRepository<EmploymentType, Long>{


		
	}