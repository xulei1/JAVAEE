package com.bear.cakeonlie.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shopcart")
public class shopcart {
	private int id;
	private int cakecount;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCakecount() {
		return cakecount;
	}

	public void setCakecount(int cakecount) {
		this.cakecount = cakecount;
	}
	
	
}
