package com.test.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {

	String 	id,
			address,
			phone,
			city;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
