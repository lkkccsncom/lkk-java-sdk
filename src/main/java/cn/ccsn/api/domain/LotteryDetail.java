package cn.ccsn.api.domain;

import java.math.BigDecimal;
import java.util.Date;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: LkkLotteryDetail 
 *@Description: 开奖中心子表
 *@author lyc
 *@date 2019年11月06日 14:41:09
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class LotteryDetail extends CcsnObject {
	/**序列ID*/
	private static final long serialVersionUID = 96065569665790827L;
	
	/** 商品id */
	private String productid;
	/** 商品开奖id */
	private String lotteryid;
	/** 订单id */
	private String orderid;
	/** 开奖ID */
	private String lotteryorderid;
	/**
     *状态0未发奖 1发奖中(退款中)2已发奖(已退款)3发奖失败(退款失败)
	 */
	private  String state;
	/** 中将金额 */
	private BigDecimal amount;
	
	/**
     * 销售平台
     */
    private String sellerstorename;

    /**
     * 购买人昵称
     */
    private String buyerName;
    /**
     * 购买人联系:电话或者电子邮件
     */
    private String buyerContact;
    /**
     * 下单时间
     */
    private Date ordertime;
	 

}