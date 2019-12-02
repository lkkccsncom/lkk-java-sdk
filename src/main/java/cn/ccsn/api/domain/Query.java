package cn.ccsn.api.domain;

import cn.ccsn.api.CcsnObject;

/**
 * 
 *@Title: Query.java  
 *@Package com.gdj.common.core.domain  
 *@Description:查询对象
 *@author gaodaojiang@hotmail.com 
 *@date 2019年3月28日 上午11:23:00  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public abstract class Query extends CcsnObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3603575424726675256L;
	/**
	 *  页码
	 */
	protected Integer page=0;
	/**
	 * 页数
	 */
	protected Integer pageSize=10;
	/**
	 *  排序字段 
	 */
	private String sort;
	/**
	 *排序方式true:asc false:desc
	 */
	private String order;
	

    /**
	 * 关键字
	 */
	private  String  keyword;



	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	

}
