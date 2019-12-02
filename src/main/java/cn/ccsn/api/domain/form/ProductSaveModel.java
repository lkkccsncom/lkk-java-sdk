package cn.ccsn.api.domain.form;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

import cn.ccsn.api.CcsnObject;

/**
 * @author 郭太林
 * @Description
 * @date 2019/10/24 0024
 */
@Getter
@Setter
public class ProductSaveModel extends CcsnObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 商家自己的商品编号 */
	private String sellerProductno;
	/** 商家自己店铺名称 */
	private String sellerBuyerTitle;
	/** 商家自己的用户id标识 */
	private String sellerBuyerCode;
	/** 标题名称 */
	private String title;
	/** 类型:1线上 2线下 */
	private String type;
	/** 类目编号： */
	private String category;
	/** 是否上架:0未上架1上架2下架 */
	private String shelf;
	/** 产品详情 */
	private String des;
	/** 图片 */
	private String imgUrl;
	/** 轮播图 */
	private List<String> imgUrls;
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
