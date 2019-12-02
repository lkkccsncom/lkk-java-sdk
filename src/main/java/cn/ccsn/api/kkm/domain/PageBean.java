package cn.ccsn.api.kkm.domain;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import lombok.Builder;
import lombok.Data;

/**
** <p>Title: PageBean</p>  
** <p>Description: 分页对象</p>  
** @author szw  
** @date 2019年1月18日
 */
@Data
@Builder
public class PageBean implements Serializable {
	
	private static final long serialVersionUID = 4202762957394441811L;

	/**
	 * 第几页
	 */
	private Integer pageIndex;

	/**
	 * 每页的条数
	 */
	private Integer pageSize;

	/**
	 * 排序字段
	 */
	private String sortName;

	/**
	 * 排序方式
	 */
	private String sortOrder;

	public PageBean() {
		pageIndex = 1;
		pageSize = 10;
	}

	public PageBean(Integer pageIndex, Integer pageSize) {
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	public PageBean(Integer pageIndex, Integer pageSize, String sortName, String sortOrder) {
		this(pageIndex, pageSize);
		this.sortName = sortName;
		this.sortOrder = sortOrder;
	}

	/**
	 ** <p>Title: getSortInfo</p>  
	 ** <p>Description: 获取排序字符串</p>  
	 ** @return
	 */
	public String getSortInfo() {
		if(StringUtils.isBlank(sortName))
			return null;
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = sortName.toCharArray(); 
		for (int i = 0; i < charArray.length; i++) { 
			if(charArray[i] >= 'A' && charArray[i] <= 'Z'){ 
				sb.append("_");
				sb.append((char)((int)charArray[i] + 32));
			} 
			else{ 
				sb.append(charArray[i]);
			} 
		}
		sortName = sb.toString();
		
		if(StringUtils.isBlank(sortOrder))
			return sortName + " " + PageOrder.ASC;
		else
			return sortName + " " + StringUtils.deleteWhitespace(sortOrder);
	}
}
