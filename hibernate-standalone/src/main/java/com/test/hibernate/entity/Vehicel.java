package com.test.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

//Table per hierarchy 
//@MappedSuperclass

//Table per class
//@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Vehicel {

	String 	tires,
			type;
	int chasiseNum;
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getChasiseNum() {
		return chasiseNum;
	}

	public void setChasiseNum(int chasisNum) {
		this.chasiseNum = chasisNum;
	}

	public String getTires() {
		return tires;
	}

	public void setTires(String tires) {
		this.tires = tires;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
