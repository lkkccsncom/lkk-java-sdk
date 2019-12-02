package cn.ccsn;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.DefaultCcsnClient;
import cn.ccsn.api.constant.ProductConst;
import cn.ccsn.api.domain.query.CategoryModel;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.CategoryRequest;
import cn.ccsn.api.response.CategoryResponse;
/**
 * 
 *@Title: CategoryTest.java  
 *@Package cn.ccsn  
 *@Description:商品类目
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午7:59:56  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class CategoryTest {
	public static void main(String[] args) {
		//getB2cPager();//获取线上商品
		//getO2oPager();//获取线下商品
		//info();//获取商品详情
		getList();//发布线上商品
	}
	
	public static CategoryResponse getList() {
		 
		String serverUrl="http://api.ccsn.cn/server-lk-test/api/category/getList";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		CategoryRequest request=new CategoryRequest();
		CategoryModel model=new CategoryModel();
		model.setCategoryType(ProductConst.Type.ONLINE);
		model.setPid("10601");
		request.setBizModel(model);
		try {
			CategoryResponse response=	client.execute(request);
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
