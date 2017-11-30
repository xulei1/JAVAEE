package com.bear.cakeonlie.entity;

import java.sql.Date;
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
@Table(name="User")
public class User {
private int id;
private String userid;
private String password;
private String name;
private String sex;
private int age;
private String IDcard;
private String number;
private int money;
//private Order order;
public User() {
	super();
}
public User(int a,String aa,String ab,String b,String c, int d, String e, String f,int g) {
	id=a;
	userid=aa;
	password=ab;
	name=b;
	sex=c;
	age=d;
	IDcard=e;
	number=f;
	money=g;
	
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public Order getOrder() {
//	return order;
//}
//public void setOrder(Order order) {
//	this.order = order;
//}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getIDcard() {
	return IDcard;
}
public void setIDcard(String iDcard) {
	IDcard = iDcard;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}




}
