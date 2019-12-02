package cn.ccsn.api.domain.query;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: ProductInfoModel.java  
 *@Package cn.ccsn.api.domain.query  
 *@Description: 商品详情
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午8:01:32  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class ProductInfoModel extends CcsnObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 商品编号 */
	private String productId;
    /**
	 * 经纬度
	 */
	private String lng;
	private String lat;

}
