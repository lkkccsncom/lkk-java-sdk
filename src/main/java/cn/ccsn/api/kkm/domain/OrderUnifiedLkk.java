package cn.ccsn.api.kkm.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

/**
** <p>Title: CreateOrderLkkRequestDto</p>  
** <p>Description: 乐柯柯下单入参</p>  
** @author szw  
** @date 2019年11月1日
 */
@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class OrderUnifiedLkk extends CcsnObject{
	
	private static final long serialVersionUID = 1826909852393111149L;

	/**
	 * 产品ID
	 */
	private String productId;
	/**
	 * 用户地址ID
	 */
    private String uaId;
    /**
     * 用户ID
     */
    private String userId;
	/**
	 * 设备ID
	 */
	private String deviceId;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 手机号码
	 */
	private String mobile;
	/**
	 * 详细地址
	 */
	private String addr;
	/**
	 * 省份
	 */
	private String provinceName;
	/**
	 * 城市
	 */
    private String cityName;
	/**
	 * 区域
	 */
    private String areaName;
    
    @Tolerate
    public OrderUnifiedLkk() {}
}