package cn.ccsn.api.domain.form;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * 
 *@Title: OrderSvCodeModel.java  
 *@Package cn.ccsn.od.domain.api.form  
 *@Description:核销
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月4日 下午2:52:09  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Setter
@Getter
public class OrderSvCodeModel  extends CcsnObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6482094404257620443L;
	/**
     * 订单ID
     */
    private String orderId;
    /**
     *  服务码 
     */
    private String svCode;
    /**
     * 商家自己的用户id标识 
     */
	private String sellerBuyerCode;
    
   

}
