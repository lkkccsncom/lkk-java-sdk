package cn.ccsn.api.domain;

import java.math.BigDecimal;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: LkkLottery 
 *@Description: 开奖信息
 *@author lyc
 *@date 2019年11月06日 14:40:48
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class Lottery  extends CcsnObject {
	/**序列ID*/
	private static final long serialVersionUID = 40034281841430922L;
	private String id;
	/** 商品编号 */
	private String productid;
	/** 开奖状态 0待满单1已满单2开奖中 3已开奖 */
	private String state;
	/** 触发开奖pid */
	private String triggerloid;
	/** 满单时间时间戳 */
	private Long manshandt;
	/** 开奖时间时间戳 */
	private Long lodt;
	/**
	 * 商品标题
	 */
	private String title;
	/**
	 * 商品主图
	 */
	private String imgUrl;
	/**
	 * 商品价格
	 */
	private BigDecimal price;
	/**
	 * 商品数量
	 */
	private Integer number;
	/**
	 * 中奖人数
	 */
	private Integer winningNum;
	/**
	 * 中奖金额
	 */
	private BigDecimal winningPrice;
	/**
	 * 销量
	 */
	private Integer saleNum;
	/**
	 * 中奖订单信息 JSON字符串
	 */
	private String prizes;

}