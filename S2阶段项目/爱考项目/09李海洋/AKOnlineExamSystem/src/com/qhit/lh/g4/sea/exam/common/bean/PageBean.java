package com.qhit.lh.g4.sea.exam.common.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李海洋
 *TODO
 *2018年1月8日下午8:38:48
 */
public class PageBean<T> {
	private static final long serialVersionUID = 3509375972998939764L;
	public static String CURRENT_INDEX = "currentIndex";
	public static String PAGE_SIZE = "pageSize";
	public static String INDEX="index";
	//当前页
	private int currentIndex;
	//每页记录数
	private int pageSize;
	//总记录数
	private int totalNumber;
	
	
	//总页数
	private int totalPage;
	//下一页
	private int nextIndex;
	//上一页
	private int preIndex;
	//将每页要显示的数据放在list集合中
	private List<T> Items;
	
	

	/**
	 * @param totalNumber
	 * @param currentIndex
	 * @param pageSize
	 * @param items
	 */
	public PageBean(int totalNumber,int currentIndex,int pageSize,List<T> items){
		this.totalNumber = totalNumber;
		this.currentIndex = currentIndex;
		this.pageSize = pageSize;
		this.Items = items;
		
	}
	
	public PageBean() {
		pageSize = 1;
		Items = new ArrayList<>();
	}
	//get、set方法
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}
	
	
	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
	
	public int getTotalNumber() {
		return totalNumber;
	}
	
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
		int size = this.totalNumber/this.pageSize;
		if(this.totalNumber%this.pageSize != 0){
			size = size + 1;
		}
		this.totalPage = size;
	}
	
	public int getTotalPage() {
		return this.totalPage;
	}

	/**
	 * 当前页的下一页，如果当前耶大于等于最后一页
	 * 那么下一页就是最后一页。
	 * 
	 * @return
	 */
	public int getNextIndex() {
		
		if(this.currentIndex >= this.getTotalPage()){
			this.nextIndex = this.currentIndex;
		}else{
			this.nextIndex = this.currentIndex + 1;
		}
		return nextIndex;
	}

	/**
	 * 当前页的上一页，如果当前页小于第一页那么上一页为1
	 * @return
	 */
	public int getPreIndex() {
		
		if(this.currentIndex <= 1){
			this.preIndex = 1;
		}else{
			this.preIndex = this.currentIndex -1;
		}
		
		return preIndex;
	}

	public List<T> getItems() {
		return Items;
	}
	
	public void setItems(List<T> items) {
		Items = items;
	}
}