package cn.ccsn.api.domain;
import java.util.Date;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

/**   
 *@Title: 订单发货流水
 *@Description:订单发货流水返回参数对象
 *@author qianfeng15085535843@outlook.com
 *@date 2019年10月22日 13:49:40
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class Delivery  extends CcsnObject {
   /**序列ID*/
	private static final long serialVersionUID = 78732793337585881L;
	/**
	 * 发货记录ID
	 */
	private String id;
	/** 商家用户id */
	private String sellerUserId;
	/** 商家id */
	private String sellerShopId;
	/** 订单id */
	private String orderId;
	/** 商品id */
	private String productId;
	/** 省份编号 */
	private String provincetr;
	/** 城市编号 */
	private String citytr;
	/** 区域编号 */
	private String countytr;
	/** 乡镇 */
	private String towntr;
	/** 详细地址 */
	private String address;
	/** 收件人姓名 */
	private String name;
	/** 收件人联系电话 */
	private String tel;
	/** 发货单位名称 */
	private String deliverycompany;
	/** 物流公司编号 */
	private String logistic;
	/** 物流公司名称 */
	private String logisticName;
	/** 物流单号 */
	private String logisticon;
	/** 物流单号图片 */
	private String logisticImg;
	/** 发货时间 */
	private Date deliverydate;
	/** 商家自己的用户id标识 */
	private String sellerBuyerCode;
	/** 发货人姓名 */
	private String sellerName;
	/** 发货人联系电话 */
	private String sellerTel;
	/** 发货地址信息 */
	private String sellerAddress;
	 /**
	  * 创建时间
	  */
	protected Date createdt;
	
	
	/**
	 * 省份名称
	 */
	private String provincetrName;
	/**
	 * 城市名称
	 */
	private String citytrName;
	/**
	 * 区域名称
	 */
	private String countytrName;
}
