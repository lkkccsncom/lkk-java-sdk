package cn.ccsn.api.domain.query;

import cn.ccsn.api.domain.Query;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: ProductQuery.java  
 *@Package cn.ccsn.api.domain.query  
 *@Description: 商品分页查询
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午8:01:44  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class ProductQuery extends Query {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 商品编号 */
	private String productno;
	/** 标题名称 */
	private String title;
	  /** 商品类目编号 */
    private String category;
    /** 商品类目编号多个逗号隔开 */
    private String categorys;
    /** 指定供货商家id */
    private String sellerIds;
    /** 商品类类型 */
    private String type;
    /** 是否为爆款商品: 1是0否 */
    private String hot;
    /**
   	 * 省份
   	 */
   	private String provincetr;
   	/**
   	 * 城市
   	 */
   	private String citytr;
   	/**
   	 * 区域
   	 */
   	private String countytr;
   	/**
   	 * 详细地址
   	 */
   	private String address;
    /**
	 * 经度
	 */
	private String lng;
	/**
	 * 纬度
	 */
	private String lat;
	/**
	 * 特殊商品类型：1消费扶贫商品
	 */
	private String specialType;

}
