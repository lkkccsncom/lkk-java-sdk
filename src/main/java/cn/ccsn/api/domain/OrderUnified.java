package cn.ccsn.api.domain;

import java.math.BigDecimal;
import java.util.Date;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OrderUnified extends CcsnObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1681861159022690882L;
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
	/** 状态0未支付1已支付2待发货3待确认4完成5取消6退回 */
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
	/** 收获类型(1收货地址(线上)2到店服务(线下) */
	private String addrestype;
	/** 服务码 */
	private String svCode;
	/** 服务码状态:0未使用1已使用 */
	private String statusCode;
	/** 平台参数json字符串 */
	private String param;
	/** 购买平台的其他参数JOSN */
	private String extra;
	 /**
	  * 创建时间
	  */
	protected Date createdt;
	 /**
     * 支付地址
     */
    private String payUrl;
    /**
     * 同步通知地址
     */
    private String returnUrl;
    /**
     * 异步通知地址
     */
    private String notifyUrl;
    /**
     * 微信JSAPI支付地址
     */
    private String wxJsapiUrl;
    /**
     * PC支付地址
     */
    private String pcPayUrl;
    /** 微信小程序JSAPI支付地址 */
	private String  wxMiniprogramJsapiUrl;
}
