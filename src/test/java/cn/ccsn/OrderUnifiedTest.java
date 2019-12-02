package cn.ccsn;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.DefaultCcsnClient;
import cn.ccsn.api.domain.form.OrderUnifiedModel;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.OrderUnifiedRequest;
import cn.ccsn.api.response.OrderUnifiedResponse;
/**
 * 
 *@Title: OrderUnifiedTest.java  
 *@Package cn.ccsn  
 *@Description: 下单
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月4日 下午5:20:16  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class OrderUnifiedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orderUnified();//下单
	}
	/**
	 * 
	 * @Description:发布线上商品
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年10月30日 下午5:28:05  
	 * @return
	 */
	public static OrderUnifiedResponse orderUnified() {
		 
		//String serverUrl="http://127.0.0.1:6051/api/order/unifiedOrder";
		String serverUrl="http://api.ccsn.cn/server-lk-test/api/order/unifiedOrder";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		OrderUnifiedRequest request=new OrderUnifiedRequest();
		OrderUnifiedModel model=new OrderUnifiedModel();
		model.setProductId("20191030065630593275");
		model.setBuyerOrderon("123456");
		model.setBuyerUserrCode("user001");
		model.setBuyerName("高道江");
		model.setBuyerContact("15808543425");
		model.setName("高道江");
		model.setTel("15808543425");
		model.setCountytr("520115");
		model.setAddress("烈变国际广场");
		model.setNotifyUrl("http://127.0.0.1:80/notifyUrl");
		model.setReturnUrl("https://www.baidu.com/");
		request.setBizModel(model);
		try {
			OrderUnifiedResponse response=	client.execute(request);
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
