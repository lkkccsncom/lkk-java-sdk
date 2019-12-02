package cn.ccsn.api.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 *@Title: LotteryInfo.java  
 *@Package cn.ccsn.api.domain  
 *@Description:开奖详情
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月6日 下午8:30:51  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
@Getter
@Setter
public class LotteryInfo extends Lottery{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6721226847240137078L;
	private List<LotteryDetail>  details;
	private List<LotteryOrder>     orders;
}
