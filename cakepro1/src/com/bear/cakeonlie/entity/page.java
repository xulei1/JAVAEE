package com.bear.cakeonlie.entity;

import java.util.List;

public class page {
	private List<product> list;
	private int totalRecords;
	private int pagesize;
	private int pageNO;
	public int getTotalPages() {
		return (totalRecords+pagesize-1)/pagesize;
	}
	public int countOffset(int currentPage,int pagesize) {
		int offset = pagesize*(currentPage-1);
		return offset;
	}
	public int getTopPageNo() {
		return 1;
	}
	public int getpreviousPageno() {
		if(pageNO<=1)
			return 1;
		pageNO = pageNO-1;
		return pageNO;
	}
	public int getNextPageNo() {
		if(pageNO>=getBottomPageNo()) {
			return getBottomPageNo();
		}
		pageNO=pageNO+1;
		return pageNO;
	}
	public int getBottomPageNo() {
		return getTotalPages();
	}
	
	public List<product> getList() {
		return list;
	}
	public void setList(List<product> list) {
		this.list = list;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getPageNO() {
		return pageNO;
	}
	public void setPageNO(int pageNO) {
		this.pageNO = pageNO;
	}
}
