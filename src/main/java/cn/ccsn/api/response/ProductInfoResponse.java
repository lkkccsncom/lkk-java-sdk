package cn.ccsn.api.response;

import cn.ccsn.api.CcsnEntityResponse;
import cn.ccsn.api.domain.Product;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: ProductB2cResponse.java  
 *@Package cn.ccsn.api.response  
 *@Description: 获取商品详情结果集
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月28日 下午2:05:05  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class ProductInfoResponse extends CcsnEntityResponse<Product> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*private  List<Product> rows;
	// 记录总数
	private int total = 0;*/
}
