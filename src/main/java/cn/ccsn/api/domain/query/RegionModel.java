/**   
* @Title: SyRegionQuery.java  
* @Package com.gdj.api.sy.domain.query  
* @Description: TODO(用一句话描述该文件做什么)  
* @author gaodaojiang@hotmail.com   
* @date 2018年8月18日 上午10:08:24  
* @version V1.0
*/
package cn.ccsn.api.domain.query;

import cn.ccsn.api.CcsnObject;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 *@Title: RegionModel.java  
 *@Package cn.ccsn.api.domain.query  
 *@Description: 地区字典
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月30日 下午8:02:07  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class RegionModel extends CcsnObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 上级编号
	 */
	private String pcode;
	/**
	 * 地区分类(字典码regiontype)
	 */
	private String regiontype;
	
	
}
