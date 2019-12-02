package cn.ccsn.api.domain.query;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 *@Title: CategoryModel.java  
 *@Package cn.ccsn.api.domain.query  
 *@Description: 商品类目 
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午8:01:19  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class CategoryModel extends CcsnObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5454424152889965297L;
	/** 名称 */
	private String name;
	/** 上级id */
	private String pid;
	/** 类目类型:1线上商品2线下商品 */
	private String categoryType;
	/**
	 * 是否是产品类目:0否1是
	 */
	private String isProduct;

}
