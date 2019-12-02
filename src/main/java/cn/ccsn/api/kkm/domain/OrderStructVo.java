package cn.ccsn.api.kkm.domain;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class OrderStructVo implements Serializable {

    private static final long serialVersionUID = -9014388030865834413L;

    private Integer orderId;

    // 总价
    private Long totalPrice;

    // 订单号
    private String orderCode;

    // 订单状态
    private Integer orderStatus;
    
    //订单来源，=5表示订单来源于乐柯柯
    private Integer srcType;

    // 商户订单列表
    private List<MerchantOrderVo> merchantOrderVos;

    @Tolerate
    public OrderStructVo() {}
}
