package cn.ccsn.api.domain.query;
import cn.ccsn.api.domain.Query;
import lombok.Getter;
import lombok.Setter;

/**   
 *@Title: 商品订单
 *@Description:商品订单检索参数对象
 *@author qianfeng15085535843@outlook.com
 *@date 2019年10月22日 13:50:10
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class OrderQuery extends Query{
    /**序列ID*/
	private static final long serialVersionUID = 68977180326211805L;
	   /** 订单号 */
	   private String orderon;

	   /**状态0待支付1已支付(待发货,待服务) 2待确认(已发货)3完成4取消5关闭6申请退款7退款 */
	   private String status;
	   /**
	    * 不包含的状态
	    */
	   private String statusNot;
	   /** 商家订单号 */
	   private String sellerUserOrderon;
	   /**购买商家自己的用户id标识 */
		private String buyerUserrCode;
	   
	 
		
}
