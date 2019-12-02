package cn.ccsn.api.domain.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import cn.ccsn.api.CcsnObject;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 *@Title: ProductUpdateModel.java  
 *@Package cn.ccsn.api.domain.form  
 *@Description: 修改商品
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月2日 下午5:21:14  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class ProductUpdateModel extends CcsnObject {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7837700072973398082L;
	/** 商品编号 */
    private String productno;
    /** 商家商品编号 */
    private String sellerProductno;
    /** 商家自己店铺名称 */
    private String sellerBuyerTitle;
    /** 商家自己的用户id标识 */
    private String sellerBuyerCode;
    /** 标题名称 */
    private String title;
    /** 是否上架:0未上架1上架2下架 */
	private String shelf;
    /** 产品详情 */
    private String des;
    /** 备注 */
    private String remark;
    /** 图片 */
    private String imgUrl;
    /** 轮播图 */
    private List<String> imgUrls;
    /** 图片key */
    private String imgKey;
    /** 价格 */
    private BigDecimal price;
    /** 一轮活动的商品数量 */
    private Integer number;
    /** 中奖数 */
    private Integer winningNum;
    /** 中奖金额 */
    private BigDecimal winningPrice;
    /** 利率 */
    private BigDecimal rate;
    /** 区域编号 */
    private String countytr;
    /** 详细地址 */
    private String address;
    /** 经度 */
    private String lng;
    /** 纬度 */
    private String lat;
    /** 运费类型:0包邮1不包邮 */
    private String freightStatus;
    /** 运费说明 */
    private String freightDes;


}
