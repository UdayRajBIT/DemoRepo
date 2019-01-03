package com.vtg.SpringProject.DemoSpringRest.Repo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cvl_ems_employment_type")
public class EmploymentType {
	
	@Id
	@Column(name="employment_type_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long employment_type_id;
	
	
	@Column(name="employment_type_name")
	private String employment_type_name;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="modified_by")
	private int modified_by;

	public long getEmployment_type_id() {
		return employment_type_id;
	}

	public void setEmployment_type_id(long employment_type_id) {
		this.employment_type_id = employment_type_id;
	}

	public String getEmployment_type_name() {
		return employment_type_name;
	}

	public void setEmployment_type_name(String employment_type_name) {
		this.employment_type_name = employment_type_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public int getModified_by() {
		return modified_by;
	}

	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}

	@Override
	public String toString() {
		return "EmploymentType [employment_type_id=" + employment_type_id + ", employment_type_name="
				+ employment_type_name + ", description=" + description + ", modified_by=" + modified_by + "]";
	}
	
	
	
}
