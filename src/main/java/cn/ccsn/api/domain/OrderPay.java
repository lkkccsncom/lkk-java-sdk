package cn.ccsn.api.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: OdOrderPay 
 *@Description: 下单支付回调信息
 *@author gaodaojiang@hotmail.com
 *@date 2019年10月31日 13:58:11
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class OrderPay extends  CcsnObject {
	/**序列ID*/
	private static final long serialVersionUID = 91068918056805062L;
	
	/** 订单ID */
	private String orderId;
	/** 异步通知地址 */
	private String notifyUrl;
	/** 同步通知地址 */
	private String returnUrl;
	/** 支付地址 */
	private String payUrl;
	/** 微信JSAPI支付地址 */
	private String wxJsapiUrl;
	/**
	 * PC支付地址
	 */
	private String  pcPayUrl;
	/** 微信小程序JSAPI支付地址 */
	private String  wxMiniprogramJsapiUrl;

}