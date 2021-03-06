package com.ibm.patient.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "patients")
public class Patient {
	
	@Id
	@Field(value="_id")
	private String id;
	private String mobile;
	private String name;
	
	public Patient() {}
	
	
	
	public Patient(String id, String mobile, String name) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.name = name;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
