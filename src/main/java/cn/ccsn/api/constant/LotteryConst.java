package cn.ccsn.api.constant;

public class LotteryConst {
	
	/**
	 * 开奖状态 0待满单1已满单2开奖中 3已开奖
	 */
	 public static final String STATE_待满单 = "0";
	 public static final String STATE_已满单 = "1";
	 public static final String STATE_开奖中 = "2";
	 public static final String STATE_已开奖 = "3";
	 
	 
	 
	 /**
	     *状态0未发奖 1发奖中(退款中)2已发奖(已退款)3发奖失败(退款失败)
		 */
	 public static  String STATE_DETAIL_未发奖="0";
	 public static  String STATE_DETAIL_发奖中="1";
	 public static  String STATE_DETAIL_已发奖="2";
	 public static  String STATE_DETAIL_发奖失败="3";
}
