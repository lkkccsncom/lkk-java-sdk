package cn.ccsn.api.kkm.domain;

import org.nutz.json.ToJson;

import cn.ccsn.api.CcsnObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class OrderDetail extends CcsnObject{
	
	private static final long serialVersionUID = -2474454811390814355L;

	private Integer odId;

    private Integer orderId;

    private Long unitPrice;

    private Long totalMoney;

    private Integer count;

    // 产品名称
    private String proTitle;

    private Integer proId;

    // 商品类型1成品,2定制,3深度定制
    private Integer proType;

    private String proSku;

    // 成品的skuId
    private Integer skuId;
    // 定制属性的id字符串拼接
    private String cusId;
    // 定制属性名字符串拼接
    private String cusStr;

    // 深度定制的属性id字符串拼接
    private String deepCusId;

    // 定制时添加的备注和尺寸
    private String odNote;
    // 长宽厚 long*width*height,比如"2366*1650*300"
    private String cusSize;

    // 门套边框类型:1单边,2双边,3三边,4四边
    private Integer rimType;

    // 订单商品商户
    private Integer proMerId;
    
    private String lkkProId;
    
    @Tolerate
    public OrderDetail() {}

    // 产品图片url
    private String proLogo;
}