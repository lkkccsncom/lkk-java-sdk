package cn.ccsn.api.domain.form;

import java.util.Date;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author qianfeng15085535843@outlook.com
 * @version 1.0.0
 * @Package cn.ccsn.lk.domain.api.form
 * @Description: 发货
 * @date 2019/10/24 16:47
 * @Copyright (c) 2019
 */
@Setter
@Getter
public class OrderDeliveryModel   extends CcsnObject{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4967293956819616486L;

	/**
     * 订单ID
     */
    private String orderId;

    /**
     * 区域 地区字典编号
     */
    private String countytr;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 收件人联系电话
     */
    private String tel;

    /**
     * 物流公司编号
     */
    private String logistic;

    /**
     * 物流公司名称
     */
    private String logisticName;

    /**
     * 物流单号
     */
    private String logisticNo;

    /**
     * 物流单图片
     */
    private String logisticImg;

    /**
     * 发货时间
     */
    private Date deliveryDate;

    /**
     * 商家自己的用户id标识
     */
    private String sellerBuyerCode;

    /**
     * 发货人姓名
     */
    private String sellerName;

    /**
     * 发货人联系电话
     */
    private String sellerTel;

    /**
     * 发货地址信息
     */
    private String sellerAddress;
    
 
}
