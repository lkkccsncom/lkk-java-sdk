package cn.ccsn.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnObject;
import cn.ccsn.api.CcsnRequest;
import cn.ccsn.api.response.ProductWaitResponse;
/**
 * 
 *@Title: CategoryRequest.java  
 *@Package cn.ccsn.api.request  
 *@Description: 等待满单统计
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午8:05:09  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class ProductWaitRequest implements CcsnRequest<ProductWaitResponse>{
	private Map<String, String> udfParams; // add user-defined text parameters
	private String bizContent;
	public String getBizContent() {
		return bizContent;
	}

	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}



	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private CcsnObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	

	public Map<String, Object> getTextParams() {		
		Map<String, Object> txtParams = new HashMap<String, Object>();
		txtParams.put("biz_content", this.bizContent);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new   HashMap<String, String>();
		}
		this.udfParams.put(key, value);
	}

	public Class<ProductWaitResponse> getResponseClass() {
		return ProductWaitResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public CcsnObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(CcsnObject bizModel) {
    	//System.err.println("参数");
        System.err.println(JSONObject.toJSONString(bizModel));
        this. bizContent=JSONObject.toJSONString(bizModel);
         this.bizModel=bizModel;
    }


}
