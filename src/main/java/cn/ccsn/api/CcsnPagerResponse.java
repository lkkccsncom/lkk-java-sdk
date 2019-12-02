package cn.ccsn.api;

import java.util.List;

public   class CcsnPagerResponse<T> extends CcsnResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  List<T> rows;
	// 记录总数
	private int total;
	private int pageSize ;
	// 总页数
	private int totalPages;
	// 当前页码
	private int currentPage;
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	
}
