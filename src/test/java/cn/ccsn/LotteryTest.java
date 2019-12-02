package cn.ccsn;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.DefaultCcsnClient;
import cn.ccsn.api.constant.OrderConst;
import cn.ccsn.api.domain.query.LotteryModel;
import cn.ccsn.api.domain.query.LotteryQuery;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.LotteryInfoRequest;
import cn.ccsn.api.request.LotteryRequest;
import cn.ccsn.api.response.LotteryInfoResponse;
import cn.ccsn.api.response.LotteryResponse;

/**
 * 
 *@Title: LotteryTest.java  
 *@Package cn.ccsn  
 *@Description: 查询开奖中奖情况
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月6日 下午8:40:10  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class LotteryTest {

	public static void main(String[] args) {
	list();//分页查询开奖情况
		//getByProductId();//根据商品编号查询开奖结果  
		//getByOrderId();//根据订单号查询开奖结果  
	}
	/**
	 * 
	 * @Description:分页查询开奖情况
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月6日 下午8:50:06  
	 * @return
	 */
	public static LotteryResponse list() {
		String serverUrl="http://api.ccsn.cn/server-lk-test/api/lottery/list";
		//String serverUrl="http://127.0.0.1:6051/api/lottery/list";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		LotteryRequest request=new LotteryRequest();
		 LotteryQuery query=new  LotteryQuery();
		query.setOrderType(OrderConst.ORDER_TYPE_销售订单);
		query.setBuyerUserrCode("19");
		request.setBizModel(query);
		try {
			 LotteryResponse response=	client.execute(request);
			response.getRows();
			System.err.println(JSONObject.toJSONString(response));
			return response;
		} catch (CcsnApiException e) {
			System.err.println("出现异常");
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 * @Description:根据商品编号查询开奖结果  
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月6日 下午8:49:44  
	 * @return
	 */
	public static LotteryInfoResponse getByProductId() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/lottery/getByProductId";
		String serverUrl="http://127.0.0.1:6051/api/lottery/getByProductId";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		LotteryInfoRequest request=new LotteryInfoRequest();
		 LotteryModel model=new  LotteryModel();
		 model.setProductId("20191106112021220494");
		request.setBizModel(model);
		try {
			LotteryInfoResponse response=	client.execute(request);
			response.getRows();
			System.err.println(JSONObject.toJSONString(response));
			return response;
		} catch (CcsnApiException e) {
			System.err.println("出现异常");
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 * @Description:根据订单号查询开奖结果
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月6日 下午8:52:08  
	 * @return
	 */
	public static LotteryInfoResponse getByOrderId() {
		String serverUrl="http://api.ccsn.cn/server-lk-test/api/lottery/getByOrderId";
		//String serverUrl="http://127.0.0.1:6051/api/lottery/getByOrderId";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		LotteryInfoRequest request=new LotteryInfoRequest();
		 LotteryModel model=new  LotteryModel();
		 model.setOrderId("20191108071428277501");
		request.setBizModel(model);
		try {
			LotteryInfoResponse response=	client.execute(request);
			response.getRows();
			System.err.println(JSONObject.toJSONString(response));
			return response;
		} catch (CcsnApiException e) {
			System.err.println("出现异常");
			e.printStackTrace();
			return null;
		}
	}
}
