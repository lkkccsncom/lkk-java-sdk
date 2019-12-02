package cn.ccsn.api.domain.query;
import cn.ccsn.api.domain.Query;
import lombok.Getter;
import lombok.Setter;

/**   
 *@Title: 开奖中心
 *@Description:开奖中心检索参数对象
 *@author lyc
 *@date 2019年11月06日 14:40:48
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class LotteryQuery extends Query{
        /**序列ID*/
	   private static final long serialVersionUID = 43637374425055019L;
	    /** 商品编号 */
	   private String productId;
	   /** 开奖状态 0待满单1已满单2开奖中 3已开奖 */
	   private String state;
	   /**
	    * 订单编号
	    */
	   private String orderId;
	   /**
	    *  seller=商品订单 buyer=销售订单all查询全部
	    */
	   private String orderType;
	   /**
	     * 销售平台自己的用户标识
	     */
	    private String buyerUserrCode;
}
