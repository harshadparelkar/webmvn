package com.test.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrimaryKeyJoinColumn;

//Table per hierarchy 
//@MappedSuperclass

//Table per class
//@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@Entity
@PrimaryKeyJoinColumn(name="chasiseNum")
public class Car extends Vehicel{
	
	String tireType;
	int numTires;
	public String getTireType() {
		return tireType;
	}
	public void setTireType(String tireType) {
		this.tireType = tireType;
	}
	public int getNumTires() {
		return numTires;
	}
	public void setNumTires(int numTires) {
		this.numTires = numTires;
	}
}
