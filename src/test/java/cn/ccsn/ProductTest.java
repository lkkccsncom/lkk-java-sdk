package cn.ccsn;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.DefaultCcsnClient;
import cn.ccsn.api.constant.ProductConst;
import cn.ccsn.api.domain.form.ProductSaveModel;
import cn.ccsn.api.domain.form.ProductUpdateModel;
import cn.ccsn.api.domain.query.MyProductQuery;
import cn.ccsn.api.domain.query.ProductInfoModel;
import cn.ccsn.api.domain.query.ProductQuery;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.MyProductRequest;
import cn.ccsn.api.request.ProductInfoRequest;
import cn.ccsn.api.request.ProductRequest;
import cn.ccsn.api.request.ProductSaveRequest;
import cn.ccsn.api.request.ProductShelfRequest;
import cn.ccsn.api.request.ProductUpdateRequest;
import cn.ccsn.api.request.ProductWaitRequest;
import cn.ccsn.api.response.MyProductResponse;
import cn.ccsn.api.response.ProductInfoResponse;
import cn.ccsn.api.response.ProductResponse;
import cn.ccsn.api.response.ProductShelfResponse;
import cn.ccsn.api.response.ProductWaitResponse;
/**
 * 
 *@Title: ProductB2cTest.java  
 *@Package cn.ccsn  
 *@Description:商品
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月29日 下午8:16:27  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class ProductTest {
	public static void main(String[] args) {
		//getB2cPager();//获取线上商品
		//getO2oPager();//获取线下商品
		
		//getSpecialPager();//获取特殊商品
		//info();//获取商品详情
		//publishB2c();//发布线上商品
		getProductWaitCount();//获取等待满单统计
		//myProducts();////查询我的商品
		//shelfDown();////查询我的商品
		//shelfUp();////查询我的商品
		//delete();//商品删除
		//update();//修改商品20191102050858757645
		
	}
	/**
	 * 
	 * @Description:删除 
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月2日 下午5:02:16  
	 * @return
	 */
	public static ProductShelfResponse delete() {
		 
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/shelfDown";
		String serverUrl="http://127.0.0.1:6051/api/product/delete";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		ProductShelfRequest request=new  ProductShelfRequest();
		Map<String, String> model=new HashMap<String, String>();
		model.put("productno","20191031063556650945");
		request.setBizContent(JSONObject.toJSONString(model));
		try {
			ProductShelfResponse response=	client.execute(request);
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
	 * @Description:下架
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月2日 下午4:44:34  
	 * @return
	 */
	public static ProductShelfResponse shelfUp() {
		 
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/shelfDown";
		String serverUrl="http://127.0.0.1:6051/api/product/shelfUp";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		ProductShelfRequest request=new  ProductShelfRequest();
		Map<String, String> model=new HashMap<String, String>();
		model.put("productno","20191031063556650945");
		request.setBizContent(JSONObject.toJSONString(model));
		try {
			ProductShelfResponse response=	client.execute(request);
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
	 * @Description:下架
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月2日 下午4:44:34  
	 * @return
	 */
	public static ProductShelfResponse shelfDown() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/shelfDown";
		String serverUrl="http://127.0.0.1:6051/api/product/shelfDown";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		ProductShelfRequest request=new  ProductShelfRequest();
		Map<String, String> model=new HashMap<String, String>();
		model.put("productno","20191031063556650945");
		request.setBizContent(JSONObject.toJSONString(model));
		try {
			ProductShelfResponse response=	client.execute(request);
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
	 * @Description:查询我的商品
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月2日 下午1:46:26  
	 * @return
	 */

	public static MyProductResponse myProducts() {
		 
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/myProducts";
		String serverUrl="http://127.0.0.1:6051/api/product/myProducts";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		MyProductRequest request=new  MyProductRequest();
		MyProductQuery query=new MyProductQuery();
		//query.setKeyword("欧顿地板时代主人");
		request.setBizModel(query);
		try {
			MyProductResponse response=	client.execute(request);
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
	 * @Description:获取等待满单统计
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年11月2日 下午1:17:08  
	 * @return
	 */
	
	public static ProductWaitResponse getProductWaitCount() {
		 
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/getWaitCount";
		String serverUrl="http://127.0.0.1:6051/api/product/getWaitCount";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		ProductWaitRequest request=new  ProductWaitRequest();
		Map<String, String> model=new HashMap<String, String>();
		model.put("app_id", KeyConstant.APP_ID);
		request.setBizContent(JSONObject.toJSONString(model));
		try {
			ProductWaitResponse response=	client.execute(request);
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
	 * @Description:发布线上商品
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年10月30日 下午5:28:05  
	 * @return
	 */
	public static ProductInfoResponse update() {
		 
	//	String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/update";
		String serverUrl="http://127.0.0.1:6051/api/product/update";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		ProductUpdateRequest request=new ProductUpdateRequest();
		ProductUpdateModel model=new ProductUpdateModel();
		model.setProductno("20191102050858757645");
		model.setSellerProductno("10002");
		model.setSellerBuyerTitle("佳和木体验店");
		model.setSellerBuyerCode("user1");
		model.setTitle("防盗窗豪华派update");
		model.setShelf(ProductConst.Shelf.UP_SHELF);
		model.setDes("很豪华");
		model.setImgUrl("http://fs.ccsn.cn/hfs/acc/fs/6/3/9/8/9/8/0/4/5551fb087a19f3d9cb0b13fd25ebad0b.jpg");
		model.setPrice(new BigDecimal("698.00"));
		model.setNumber(10);
		model.setWinningNum(1);
		model.setWinningPrice(new BigDecimal("698.00"));
		//如果是动态利率必须传
		//model.setRate(new BigDecimal("0.03"));
		model.setFreightStatus(ProductConst.Freight.FREIGHT_FREE);
		request.setBizModel(model);
		try {
			ProductInfoResponse response=	client.execute(request);
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
	 * @Description:发布线上商品
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年10月30日 下午5:28:05  
	 * @return
	 */
	public static ProductInfoResponse publishB2c() {
		 
	//	String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/publishB2c";
		String serverUrl="http://127.0.0.1:6051/api/product/publishB2c";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		ProductSaveRequest request=new ProductSaveRequest();
		ProductSaveModel model=new ProductSaveModel();
		model.setSellerProductno("10002");
		model.setSellerBuyerTitle("佳和木体验店");
		model.setSellerBuyerCode("user1");
		model.setTitle("防盗窗豪华派");
		model.setType(ProductConst.Type.ONLINE);
		model.setCategory("10601007001001");
		model.setShelf(ProductConst.Shelf.UP_SHELF);
		model.setDes("很豪华");
		model.setImgUrl("http://fs.ccsn.cn/hfs/acc/fs/6/3/9/8/9/8/0/4/5551fb087a19f3d9cb0b13fd25ebad0b.jpg");
		model.setPrice(new BigDecimal("698.00"));
		model.setNumber(10);
		model.setWinningNum(1);
		model.setWinningPrice(new BigDecimal("698.00"));
		//如果是动态利率必须传
		//model.setRate(new BigDecimal("0.03"));
		model.setFreightStatus(ProductConst.Freight.FREIGHT_FREE);
		request.setBizModel(model);
		try {
			ProductInfoResponse response=	client.execute(request);
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
	 * @Description:销售线上商品 
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年10月30日 下午12:30:59  
	 * @return
	 */
	public static ProductResponse getB2cPager() {
		String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/getB2cPager";
		//String serverUrl="http://127.0.0.1:6051/api/product/getB2cPager";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		
		ProductRequest request=new ProductRequest();
		/*Map<String, Object> bizContent=new HashMap<String, Object>();
		bizContent.put("page", 1);
		bizContent.put("pageSize", 10);*/
		//request.setBizContent(JSONObject.toJSONString(bizContent));
		ProductQuery query=new ProductQuery();
		//query.setKeyword("玻璃门");
		//指定多个类目获取
		//query.setCategorys("10601,10001");
		request.setBizModel(query);
		try {
			ProductResponse response=	client.execute(request);
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
	 * @Description:销售线下商品
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年10月30日 下午12:31:12  
	 * @return
	 */
	public static ProductResponse getO2oPager() {
		//String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/getO2oPager";
		String serverUrl="http://127.0.0.1:6051/api/product/getO2oPager";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		ProductRequest request=new ProductRequest();
		ProductQuery query=new ProductQuery();
		query.setLat("106.624733");
		query.setLng("26.649863");
		request.setBizModel(query);
		try {
			ProductResponse response=	client.execute(request);
			response.getRows();
			System.err.println(JSONObject.toJSONString(response));
			return response;
		} catch (CcsnApiException e) {
			System.err.println("出现异常");
			e.printStackTrace();
			return null;
		}
	}
	public static ProductResponse getSpecialPager() {
		 
	//	String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/getSpecialPager";
		String serverUrl="http://127.0.0.1:6051/api/product/getSpecialPager";
		CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
		ProductRequest request=new ProductRequest();
		ProductQuery query=new ProductQuery();
		query.setSpecialType(ProductConst.Special.type_消费扶贫);
		request.setBizModel(query);
		try {
			ProductResponse response=	client.execute(request);
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
	 * @Description:商品详情
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年10月30日 下午12:31:23  
	 * @return
	 */
	public static ProductInfoResponse info() {
		   String serverUrl="http://api.ccsn.cn/server-lk-test/api/product/info";
		   // String serverUrl="http://127.0.0.1:6051/api/product/info";
			CcsnClient client=new  	DefaultCcsnClient(serverUrl, KeyConstant.APP_ID, KeyConstant.PRI_KEY, KeyConstant.PUB_KEY);
			ProductInfoRequest request=new ProductInfoRequest();
			ProductInfoModel model=new ProductInfoModel();
			model.setProductId("d33dd87ad66440bf98f896dc9540591c");
			//model.setLat("106.624733");
			//model.setLng("26.649863");
			request.setBizModel(model);
		try {
			ProductInfoResponse response=	client.execute(request);
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
