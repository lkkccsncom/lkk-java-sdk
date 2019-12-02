package cn.ccsn.api.request;

import java.util.Map;
/**
 * 
 *@Title: RequestParametersHolder.java  
 *@Package cn.ccsn.api.request  
 *@Description: 构建参数对象
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午12:15:41  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class RequestParametersHolder {
	private Map<String, Object> protocalMustParams;
	private  Map<String, Object> protocalOptParams;
	private  Map<String, Object> applicationParams;
	public Map<String, Object> getProtocalMustParams() {
		return protocalMustParams;
	}
	public void setProtocalMustParams(Map<String, Object> protocalMustParams) {
		this.protocalMustParams = protocalMustParams;
	}
	public Map<String, Object> getProtocalOptParams() {
		return protocalOptParams;
	}
	public void setProtocalOptParams(Map<String, Object> protocalOptParams) {
		this.protocalOptParams = protocalOptParams;
	}
	public Map<String, Object> getApplicationParams() {
		return applicationParams;
	}
	public void setApplicationParams(Map<String, Object> applicationParams) {
		this.applicationParams = applicationParams;
	}
	
}
