package cn.ccsn.api.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: LkkCategory 
 *@Description: 乐柯柯商品类目
 *@author leogtl@163.com
 *@date 2019年10月21日 15:14:25
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class Category extends CcsnObject {
	/**序列ID*/
	private static final long serialVersionUID = 47177567713146271L;
	/**
	 * 类目id
	 */
	private String id;
	/** 名称 */
	private String name;
	/** 上级id */
	private String pid;
	/** 图片地址 */
	private String imgurl;
	/** 顺序 */
	private Integer oid;
	/**类目类型:1线上商品2线下商品 */
	private String categoryType;
	/**
	 * 是否是产品类目:0否1是
	 */
	private String isProduct;


}