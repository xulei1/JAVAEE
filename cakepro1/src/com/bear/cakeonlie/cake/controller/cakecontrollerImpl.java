package com.bear.cakeonlie.cake.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.cakeonlie.cake.service.CakeServiceImpl;
import com.bear.cakeonlie.entity.Order;
import com.bear.cakeonlie.entity.Type;
import com.bear.cakeonlie.entity.User;
import com.bear.cakeonlie.entity.page;
import com.bear.cakeonlie.entity.product;

@Controller
@RequestMapping("user")
public class cakecontrollerImpl {

	@Resource
	private  CakeServiceImpl CakeServiceImpl;
	@RequestMapping("/list")
	public String list(Model model) {
		List<Type> list = this.CakeServiceImpl.listall();
		model.addAttribute("list", list);
		return "list";
		
	}
	@RequestMapping("/shop")
	public String findcake(Model model) {
		List<product> list = this.CakeServiceImpl.findcake();
		model.addAttribute("list1", list);
		return "shop";
	}
	@RequestMapping("/zhuce")
	public String saveuser(User u) {
		CakeServiceImpl.addu(u);
		return "shouye";
	}
	@RequestMapping("/shouye")
	public String login(String userid,String password) {
		 CakeServiceImpl.login(userid, password);
		if( CakeServiceImpl.login(userid, password)) {
			 return "denglu";
		}else {
			return "error";
		}
	}
	@RequestMapping(value="/showpage")
	public String findallProduct(HttpServletRequest request, HttpServletResponse response, Model model) {
		String pageno = request.getParameter("pageNO");
		System.out.println(pageno);
		if(pageno==null) {
			pageno="1";
			int pageNo= Integer.parseInt(pageno);
		}else {
			int pageNo= Integer.parseInt(pageno);
			pageNo= Integer.parseInt(pageno);
		}
		int pageNo= Integer.parseInt(pageno);
		
		
		page page=CakeServiceImpl.queryforPage(Integer.valueOf(pageno), 2);
		request.setAttribute("page", page);
		List<product> product = page.getList();
		request.setAttribute("product", product);
		List<product> list = this.CakeServiceImpl.findcake();
		model.addAttribute("list1", list);
		return "showpage";
		
	}
	@RequestMapping(value="/detail")
	public String findbyname(String name , Model model) {
		product p =CakeServiceImpl.findbyname(name);
		model.addAttribute("p", p);
		return "detail";
	}
}
