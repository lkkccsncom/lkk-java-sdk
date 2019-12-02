package cn.ccsn.api.kkm.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Data;

/**
 * Title: Request
 * Description: 
 * @author shizw
 * @date 2019年2月15日  
 * @param <T>
 */
@Data
public class Request<T> extends CcsnObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 395279772850808953L;

	/**
	 * 分页对象
	 */
	private PageBean page;

	/**
	 * 参数对象
	 */
	private T obj;

}
