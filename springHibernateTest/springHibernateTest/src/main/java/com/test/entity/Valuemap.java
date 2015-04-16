package com.test.entity;

import javax.persistence.Entity;

@Entity
public class Valuemap {

	String 	key_col,
			val_col;

	public String getKey_col() {
		return key_col;
	}

	public void setKey_col(String key_col) {
		this.key_col = key_col;
	}

	public String getVal_col() {
		return val_col;
	}

	public void setVal_col(String val_col) {
		this.val_col = val_col;
	}
}
