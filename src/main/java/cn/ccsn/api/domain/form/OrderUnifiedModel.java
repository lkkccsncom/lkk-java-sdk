package cn.ccsn.api.domain.form;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderUnifiedModel extends CcsnObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 商品id */
	private String productId;
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
	/** 区域编号 */
	private String countytr;
	/** 乡镇 */
	private String towntr;
	/** 详细地址 */
	private String address;
	/** 购买平台的其他参数JOSN*/
	private String extra;
	/**
	 * 异步通知地址
	 */
	private String notifyUrl;
	/**
	 * 同步通知地址
	 */
	private String returnUrl;
}
