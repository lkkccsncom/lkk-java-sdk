package cn.ccsn.api.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
/**
 * 
 *@Title: ProductWaitCountResult.java  
 *@Package cn.ccsn.lk.domain.api.result  
 *@Description:等待满单统计
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月2日 下午1:01:27  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class ProductWaitCount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4678990871010993465L;
	/**
	 * 等待满单统计
	 */
     private Long count;
}
