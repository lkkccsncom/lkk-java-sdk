package cn.ccsn.api.kkm.domain;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class MerchantOrderVo implements Serializable {

    private static final long serialVersionUID = 5936077041276898346L;
    // 子订单就是商户订单
    private Integer merchantId;

    private String merchantName;

    private Integer orderId;

    private String orderCode;

    // 总订单Id
    private Integer pId;

    // 订单详情列表
    private List<OrderDetail> orderDetails;
    
    @Tolerate
    public MerchantOrderVo() {}
}