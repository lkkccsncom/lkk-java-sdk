package cn.ccsn.api.constant;
/**
 * 
 *@Title: OrderConst.java  
 *@Package cn.ccsn.api.constant  
 *@Description: 订单常量
 *@author gaodaojiang@hotmail.com 
 *@date 2019年11月5日 上午10:09:58  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */
public class OrderConst {

    //线上:
    // 0待支付  1已支付/待发货  2已发货/待确认 3完成 4取消 5关闭 6申请退款 7退款
    //线下:
    // 0待支付  1已支付/待服务  3完成 4取消 5关闭 6申请退款 7退款
    public static final String STATUS_未支付 = "0";
    public static final String STATUS_已支付= "1";
    public static final String STATUS_已发货_待确认 = "2";
    public static final String STATUS_订单完成 = "3";
    public static final String STATUS_订单取消 = "4";
    public static final String STATUS_订单关闭 = "5";
    public static final String STATUS_申请退款 = "6";
    public static final String STATUS_退款 = "7";


	/** 订单类型(1线上商品2线下商品) */
    public static String TYPE_线上商品="1";
    public static String TYPE_线下商品="2";
    
    
    /** 收获类型(1收货地址(线上)2到店服务(线下) */
    public static String ADDRESTYPE_收货地址="1";
    public static String ADDRESTYPE_服务="2";
    
    
    /** 服务码状态:0未使用1已使用 */
    public static String STATUSCODE_未使用="0";
    public static String STATUSCODE_已使用="1";
    
    
    /** seller=商品订单 buyer=销售订单*/
    public static String ORDER_TYPE_商品订单="seller";
    public static String ORDER_TYPE_销售订单="buyer";
}
