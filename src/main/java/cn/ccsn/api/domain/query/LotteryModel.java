package cn.ccsn.api.domain.query;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lyc
 * @version 1.0.0
 * @Description: 开奖中心主表
 * @date 2019年10月22日 13:50:10
 * @Copyright (c) 2019
 */
@Getter
@Setter
public class LotteryModel  extends CcsnObject{
    /**
     * 序列ID
     */
    private static final long serialVersionUID = 5397795766991976204L;
    /**
     * 商品编号
     */
    private String productId;

    /**
     * 订单ID
     */
    private String orderId;

   

}