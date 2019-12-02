package cn.ccsn;

import java.util.Date;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.DefaultCcsnClient;
import cn.ccsn.api.constant.OrderConst;
import cn.ccsn.api.domain.form.OrderDeliveryModel;
import cn.ccsn.api.domain.form.OrderSuccessModel;
import cn.ccsn.api.domain.form.OrderSvCodeModel;
import cn.ccsn.api.domain.query.OrderInfoModel;
import cn.ccsn.api.domain.query.OrderQuery;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.OrderInfoRequest;
import cn.ccsn.api.request.OrderRequest;
import cn.ccsn.api.request.OrderStatusRequest;
import cn.ccsn.api.response.OrderInfoResponse;
import cn.ccsn.api.response.OrderResponse;
import cn.ccsn.api.response.OrderStatusResponse;
/**
 * 
 *@Title: OrderTest.java  
 *@Package cn.ccsn  
 *@Description: 订单
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月4日 下午5:19:56  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class OrderTest {

	public static void main(String[] args) {
	//	listBuyer();//分页查询销售订单
		//listSeller();//分页查询商品订单
		//confirmOrder();//订单确认完成
		//svCode();//核销完成
		//delivery();//核销完成
		info();//订单详情
	}
	
	
	/**
	 * 
	 * @Description:订单详情
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月4日 下午5:22:21  
	 * @return
	 */
	public static OrderInfoResponse info() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/order/info";
		String serverUrl="http://127.0.0.1:6051/api/order/info";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		OrderInfoRequest request=new OrderInfoRequest();
		OrderInfoModel model=new OrderInfoModel();
		model.setOrderId("20191101080848251846");
		model.setOrderType(OrderConst.ORDER_TYPE_商品订单);
		request.setBizModel(model);
		try {
			OrderInfoResponse response=	client.execute(request);
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
	 * @Description:分页查询销售订单
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月4日 下午5:22:21  
	 * @return
	 */
	public static OrderResponse listBuyer() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/order/listBuyer";
		String serverUrl="http://127.0.0.1:6051/api/order/listBuyer";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		OrderRequest request=new OrderRequest();
		OrderQuery query=new OrderQuery();
		query.setStatus("0,1,2");
		request.setBizModel(query);
		try {
			OrderResponse response=	client.execute(request);
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
	 * @Description:分页查询商品订单
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月4日 下午5:22:21  
	 * @return
	 */
	public static OrderResponse listSeller() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/order/listBuyer";
		String serverUrl="http://127.0.0.1:6051/api/order/listSeller";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		OrderRequest request=new OrderRequest();
		OrderQuery query=new OrderQuery();
		query.setStatus("0,1,2");
		request.setBizModel(query);
		try {
			OrderResponse response=	client.execute(request);
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
	 * @Description:确认订单
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月4日 下午5:22:21  
	 * @return
	 */
	public static OrderStatusResponse confirmOrder() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/order/confirmOrder";
		String serverUrl="http://127.0.0.1:6051/api/order/confirmOrder";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		OrderStatusRequest request=new OrderStatusRequest();
		OrderSuccessModel query=new OrderSuccessModel();
		query.setOrderId("20191025050208925121");
		request.setBizModel(query);
		try {
			OrderStatusResponse response=	client.execute(request);
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
	 * @Description:订单核销
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月4日 下午5:42:53  
	 * @return
	 */
	public static OrderStatusResponse svCode() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/order/confirmOrder";
		String serverUrl="http://127.0.0.1:6051/api/order/svCode";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		OrderStatusRequest request=new OrderStatusRequest();
		OrderSvCodeModel model=new OrderSvCodeModel();
		model.setOrderId("20191030042645366702");
		model.setSvCode("938435");
		model.setSellerBuyerCode("user001");
		request.setBizModel(model);
		try {
			OrderStatusResponse response=	client.execute(request);
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
	 * @Description:发货
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月4日 下午5:58:03  
	 * @return
	 */
	public static OrderStatusResponse delivery() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/order/confirmOrder";
		String serverUrl="http://127.0.0.1:6051/api/order/delivery";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		OrderStatusRequest request=new OrderStatusRequest();
		OrderDeliveryModel model=new OrderDeliveryModel();
		model.setOrderId("20191101080848251846");
		model.setCountytr("520115");
		model.setAddress("金阳北路 烈变国际广场");
		model.setName("高道江");
		model.setTel("15808543425");
		model.setLogistic(null);//目前为空后期对接物流公司预留字段
		model.setLogisticName("德邦物流");
		model.setLogisticNo("2343545454545454");
		model.setLogisticImg("http://fs.ccsn.cn/hfs/acc/fs/6/3/9/8/9/8/0/4/5551fb087a19f3d9cb0b13fd25ebad0b.jpg");
		model.setDeliveryDate(new Date());
		model.setSellerBuyerCode("user001");
		model.setSellerName("张三");
		model.setSellerTel("18224833425");
		model.setSellerAddress("贵州省贵阳市南明区师大");
		request.setBizModel(model);
		try {
			OrderStatusResponse response=	client.execute(request);
			System.err.println(JSONObject.toJSONString(response));
			return response;
		} catch (CcsnApiException e) {
			System.err.println("出现异常");
			e.printStackTrace();
			return null;
		}
	}
	
}
