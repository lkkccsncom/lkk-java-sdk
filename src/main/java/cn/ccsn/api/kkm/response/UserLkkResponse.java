/**   
* @Title: LotteryResponse.java  
* @Package cn.ccsn.api.response  
* @Description: TODO(用一句话描述该文件做什么)  
* @author gaodaojiang@hotmail.com   
* @date 2019年11月6日 下午8:38:34  
* @version V1.0
*/
package cn.ccsn.api.kkm.response;

import java.util.List;

import cn.ccsn.api.CcsnResponse;
import cn.ccsn.api.kkm.domain.UserLkk;
import lombok.Getter;
import lombok.Setter;

/**   
 *@Title: LotteryResponse.java  
 *@Package cn.ccsn.api.response  
 *@Description: 开奖结果集
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月6日 下午8:38:34  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class UserLkkResponse extends CcsnResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4103966161801426793L;
	private     List<UserLkk> rows;
}
