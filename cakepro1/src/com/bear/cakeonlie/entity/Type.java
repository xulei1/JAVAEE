package com.bear.cakeonlie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="type")
public class Type {
	private int id;
	private String changhe;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChanghe() {
		return changhe;
	}

	public void setChanghe(String changhe) {
		this.changhe = changhe;
	}

	

	
	
}
