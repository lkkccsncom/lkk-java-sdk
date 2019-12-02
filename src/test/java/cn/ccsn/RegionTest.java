package cn.ccsn;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.DefaultCcsnClient;
import cn.ccsn.api.domain.query.RegionModel;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.RegionRequest;
import cn.ccsn.api.response.RegionResponse;
/**
 * 
 *@Title: RegionTest.java  
 *@Package cn.ccsn  
 *@Description: 获取地区字典
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午8:13:18  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class RegionTest {

	public static void main(String[] args) {
		//getB2cPager();//获取线上商品
		//getO2oPager();//获取线下商品
		//info();//获取商品详情
		getList();//发布线上商品
	}
	
	public static RegionResponse getList() {
		String serverUrl="http://api.ccsn.cn/server-system-test/api/region/getList";
		//String serverUrl="http://127.0.0.1:6021/api/region/getList";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		RegionRequest request=new RegionRequest();
		RegionModel model=new RegionModel();
		model.setPcode("-1");
		request.setBizModel(model);
		try {
			RegionResponse response=	client.execute(request);
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
