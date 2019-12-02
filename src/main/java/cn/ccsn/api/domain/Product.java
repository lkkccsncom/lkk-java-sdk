package cn.ccsn.api.domain;

import java.math.BigDecimal;
import java.util.Date;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Product  extends CcsnObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3847237949756484510L;
	/** 商品编号 */
	private String productno;
	/** 商家id */
	private String sellerShopId;
	/** 商家自己店铺名称 */
	private String sellerBuyerTitle;
	/** 标题名称 */
	private String title;
	/** 类型:1线上 2线下 */
	private String type;
	/** 类目编号： */
	private String category;
	/** 是否上架:0未上架1上架2下架 */
	private String shelf;
	/** 审批状态：0未审批1已经审批3违规商品*/
	private String status;
	/** 上架时间 */
	private Date shelfDate;
	/** 产品详情 */
	private String des;
	/** 图片 */
	private String imgUrl;
	/** 价格 */
	private BigDecimal price;
	/** 一轮活动的商品数量 */
	private Integer number;
	/** 中奖数 */
	private Integer winningNum;
	/** 中奖金额 */
	private BigDecimal winningPrice;
	/** 利率点类型: 0固定利率1动态利率 */
	private String rateType;
	/** 利率 */
	private BigDecimal rate;
	/** 省份编号 */
	private String provincetr;
	/** 城市编号 */
	private String citytr;
	/** 区域编号 */
	private String countytr;
	/** 乡镇编号 */
	private String towntr;
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
	 /**
	  * 创建时间
	  */
	protected Date createdt;
	/*********************************************/

    /**
     * 类目名称
     */
	private String categoryName;
	/**
	 * 平台商家用户昵称
	 */
	private String sellerUserName;
	/**
	 * 平台商家名称
	 */
	private String sellerShopName;
	/**
	 * 当前销量
	 */
	private String orderNum;
	/**
	 * 轮播图
	 */
	private String imgUrls;
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
	/**
	 * 乡镇名称
	 */
	private String towntrName;
	/**
	 * 距离单位米m
	 */
	private String m;
	/**
	 * 距离单位公里
	 */
	private String km;
	/**
	 * 凑单数
	 */
	private Integer endNum;
	/**
	 * 是否是消费扶贫商品:0否1是
	 */
	private Integer poorNum;
}
