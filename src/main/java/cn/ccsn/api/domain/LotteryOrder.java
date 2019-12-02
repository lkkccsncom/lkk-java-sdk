package cn.ccsn.api.domain;

import java.math.BigDecimal;
import java.util.Date;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: LkkLotteryOrder 
 *@Description: 开奖订单
 *@author lyc
 *@date 2019年11月06日 14:41:21
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class LotteryOrder extends CcsnObject {
	/**序列ID*/
	private static final long serialVersionUID = 6565924254961390L;
	
	/** 商品id */
	private String productid;
	/** 商品开奖id */
	private String lotteryid;
	/** 订单id */
	private String orderid;

    /**
     * 销售平台
     */
    private String sellerstorename;

    /**
     * 是否中奖 0否1是
     */
    private String win;
    /**
     * 购买人昵称
     */
    private String buyerName;
    /**
     * 购买人联系:电话或者电子邮件
     */
    private String buyerContact;
    /**
     * 中将金额
     */
    private BigDecimal amount;
    /**
     * 下单时间
     */
    private Date ordertime;
}