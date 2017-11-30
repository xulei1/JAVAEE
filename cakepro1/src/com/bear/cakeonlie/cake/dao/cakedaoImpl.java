package com.bear.cakeonlie.cake.dao;



import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bear.cakeonlie.entity.Order;
import com.bear.cakeonlie.entity.Type;
import com.bear.cakeonlie.entity.User;
import com.bear.cakeonlie.entity.product;

@Repository

public class cakedaoImpl {

	@Resource
	private SessionFactory sessionfactory;
	
	public List<Type> findAll(){
		Query q=this.sessionfactory.getCurrentSession().createQuery("from Type");
		return q.list();
	}
	public void addUser(User u) {
		this.sessionfactory.getCurrentSession().save(u);
	}
	public boolean login(String userid,String password) {
		String sql = "from User where userid='"+userid+"' and password='"+password+"'";
		Query q =  this.sessionfactory.getCurrentSession().createQuery(sql);
		List list =q.list();
		return list.size()>0? true:false;
	}
	public List<product> findcake(){
			Query q = this.sessionfactory.getCurrentSession().createQuery("from product ");
			return q.list();
	}
	public int getall(){
		Query q = this.sessionfactory.getCurrentSession().createQuery("from product ");
		return q.list().size();
}
	public List<product> querypage(int offset,int length){
		List<product> entitylist=null;
		Query query  = this.sessionfactory.getCurrentSession().createQuery("from product");
		query.setFirstResult(offset);
		query.setMaxResults(length);
		entitylist = query.list();
		return entitylist;
	}
	public product findbyname(String name) {
		String sql = "from product where name='"+name+"'";
		product p = (product) this.sessionfactory.getCurrentSession().createQuery(sql);
		return p;
	}
	
}
