package cn.ccsn.api.domain;

import java.math.BigDecimal;
import java.util.Date;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OrderInfo extends CcsnObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6620145866803854355L;
	

	/** 订单号 */
	private String orderon;
	/** 类型:1线上 2线下 */
	private String type;
	/** 商品id */
	private String productId;
	/** 商品主图 */
	private String imgurl;
	/** 标题名称 */
	private String title;
	/** 商品价格 */
	private BigDecimal price;
	/** 运费金额 */
	private BigDecimal freightPrice;
	/** 支付总金额 */
	private BigDecimal amount;
	/** 运费类型:0包邮1不包邮 */
	private String freightStatus;
	/**
	 * 状态0待支付1已支付(待发货,待服务) 2待确认(已发货)3完成4取消5关闭6申请退款7退款
	 */
	private String status;
	/** 供货商家用户id */
	private String sellerUserId;
	/** 供货商家id */
	private String sellerShopId;
	/**
	 * 购买平台商家id
	 */
	private String buyerShopId;
	/**
	 * 购买平台商家用户id
	 */
	private String buyerUserId;
	/** 购买商家订单号*/
	private String buyerOrderon;
	/**购买商家自己的用户id标识 */
	private String buyerUserrCode;
	/** 购买人昵称 */
	private String buyerName;
	/** 购买人联系:电话或者电子邮件 */
	private String buyerContact;
	/** 收件人姓名 */
	private String name;
	/** 收件人电话 */
	private String tel;
	/** 详细地址 */
	private String address;
	/** 收获类型(1收货地址(线上)2到店服务(线下) */
	private String addrestype;
	/** 服务码 */
	private String svCode;
	/** 服务码状态:0未使用1已使用 */
	private String statusCode;
	/** 我们自己参数json字符串 */
	private String param;
	/** 购买平台的其他参数JOSN */
	private String extra;
	 /**
	  * 创建时间
	  */
	protected Date createdt;
	/**
	 * 供货商家名称
	 */
	private String sellerShopName;
	/**
	 * 销售平台商家名称
	 */
	private String buyerShopName;
	
	/**
	 * 发货记录
	 */
	private Delivery delivery;
	/**
	 * 支付地址信息
	 */
	private OrderPay pay;
}
