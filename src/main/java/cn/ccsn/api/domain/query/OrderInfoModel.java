package cn.ccsn.api.domain.query;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 *@Title: OdOrderApiModel.java  
 *@Package cn.ccsn.od.domain.api.query  
 *@Description:订单详情
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月5日 上午9:02:58  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class OrderInfoModel extends CcsnObject{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3082114258551588635L;
	/** 订单号*/
    private String orderId;
    /** seller=商品订单 buyer=销售订单*/
    private String orderType;
    


}
