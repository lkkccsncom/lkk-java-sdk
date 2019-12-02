package cn.ccsn.api.domain.form;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: OdOrderSuccess 
 *@Description: 订单确认完成流水
 *@author qianfeng15085535843@outlook.com
 *@date 2019年10月22日 13:50:16
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class OrderSuccessModel extends CcsnObject{
	/**序列ID*/
	private static final long serialVersionUID = 75958705693147456L;

	/** 订单id */
	private String orderId;
	

}