package com.bear.cakeonlie.cake.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.cakeonlie.cake.dao.cakedaoImpl;
import com.bear.cakeonlie.entity.Order;
import com.bear.cakeonlie.entity.Type;
import com.bear.cakeonlie.entity.User;
import com.bear.cakeonlie.entity.page;
import com.bear.cakeonlie.entity.product;

@Service
@Transactional(readOnly=true)
public class CakeServiceImpl {
	
	@Resource
	private cakedaoImpl cakedaoImpl;
	
	public List<Type> listall(){
		return cakedaoImpl.findAll();
	}
	public void addu (User u) {
		cakedaoImpl.addUser(u);
	}
	public boolean login(String userid,String password) {
		return cakedaoImpl.login(userid, password);
	}
	public List<product> findcake(){
		return cakedaoImpl.findcake();
	}
	public page queryforPage(int currentPage , int pagesize) {
		page page= new page();
		int allrow= cakedaoImpl.getall();
		int offset = page.countOffset(currentPage, pagesize);
		List<product> list = cakedaoImpl.querypage(offset, pagesize);
		page.setPageNO(currentPage);
		page.setPagesize(pagesize);
		page.setTotalRecords(allrow);
		page.setList(list);
		
		
		return page;
	}
	public product findbyname(String name) {
		return cakedaoImpl.findbyname(name);
	}
}
