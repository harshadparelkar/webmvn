package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="valuemap")
public class Valuemap {

	@Id
	String	id;
	
	String	key_col,			
			val_col;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
