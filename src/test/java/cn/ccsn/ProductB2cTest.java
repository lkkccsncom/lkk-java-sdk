package cn.ccsn;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.DefaultCcsnClient;
import cn.ccsn.api.domain.query.ProductQuery;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.ProductB2cRequest;
import cn.ccsn.api.response.ProductB2cResponse;
/**
 * 
 *@Title: ProductB2cTest.java  
 *@Package cn.ccsn  
 *@Description:获取线上商品deome
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月29日 下午8:16:27  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class ProductB2cTest {
    private static String serverUrl="http://127.0.0.1:6051/api/product/getB2cPager";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		ProductB2cRequest request=new ProductB2cRequest();
		/*Map<String, Object> bizContent=new HashMap<String, Object>();
		bizContent.put("page", 1);
		bizContent.put("pageSize", 10);*/
		//request.setBizContent(JSONObject.toJSONString(bizContent));
		ProductQuery productQuery=new ProductQuery();
		request.setBizModel(productQuery);
		
		
		try {
			ProductB2cResponse b2cResponse=	client.execute(request);
			b2cResponse.getRows();
			System.err.println(JSONObject.toJSONString(b2cResponse));
		} catch (CcsnApiException e) {
			System.err.println("出现异常");
			e.printStackTrace();
		}
	}

}
