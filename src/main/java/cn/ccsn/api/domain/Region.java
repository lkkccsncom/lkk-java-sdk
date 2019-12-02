/**   
* @Title: SyRegion.java  
* @Package com.gdj.api.sy.domain  
* @Description: TODO(用一句话描述该文件做什么)  
* @author gaodaojiang@hotmail.com   
* @date 2018年8月18日 上午9:43:28  
* @version V1.0
*/
package cn.ccsn.api.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

/**   
 *@Title: SyRegion.java  
 *@Package com.gdj.api.sy.domain  
 *@Description:地区字典
 *@author gaodaojiang@hotmail.com 
 *@date 2018年8月18日 上午9:43:28  
 *@version 1.0.0
 *@Copyright  (c) 2018
 */
@Getter
@Setter
public class Region  extends CcsnObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 默认一级省份PCODE
	 */
	public static final String PCODE_DEFAULT = "-1";
	/**
	 * 默认国家代码
	 */
	public static final String NATIONALITY_DEFAULT = "CN";
	/**
	 * 地区编码
	 */
	private String code;
	/**
	 * 地区名称
	 */
	private String name;
	/**
	 * 简称
	 */
	private String nameshort;
	/**
	 * 城乡分类代码(参考系统字典码citycountry)
	 */
	private String citycountry;
	/**
	 * 顺序
	 */
	private Long oid;
	/**
	 * 上级编号
	 */
	private String pcode;
	/**
	 * 地区分类(参考系统字典码regiontype)
	 *  provincetr=省份、
	 *  citytr=城市 、
	 *  countytr=区/县市  
	 *  towntr=办事处/乡镇
	 *  villagetr=居委会/村委会
	 *  street= 街道/村庄/组
	 */
	private String regiontype;
	/**
	 * 邮编
	 */
	private String zipcode;
	/**
	 * 电话区号
	 */
	private String areacode;
	/**
	 * 启用状态0禁用1启用
	 */
	private Integer status;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 国籍代码  中国=CN 默认CN
	 */
	private String nationality;
	/**
	 * 首字母
	 */
	private String initial;
	/**
	 * 是否是热门城市：0否1是
	 */
	private Integer hot;
	/**
	 * 其他参数JSON格式
	 */
	private String extra;
	
	
	
	
}
