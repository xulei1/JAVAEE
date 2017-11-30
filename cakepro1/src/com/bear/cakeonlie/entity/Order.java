package com.bear.cakeonlie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name="Order")
public class Order {
	private int id;
	private String cakename;
	//private User user;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCakename() {
		return cakename;
	}
	public void setCakename(String cakename) {
		this.cakename = cakename;
	}
	
	
	//@ManyToOne
	//@JoinColumn(name="Userid")
	//public User getUser() {
	//	return user;
	//}
	//public void setUser(User user) {
		//this.user = user;
	//}
	
}
