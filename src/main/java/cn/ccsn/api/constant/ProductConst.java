package cn.ccsn.api.constant;

/**
 * @author 郭太林
 * @Description
 * @date 2019/10/21 0021
 */
public class ProductConst {

    /** 类型:1线上 2线下 */
    public static class Type {
        public static final String ONLINE = "1";
        public static final String OFFLINE = "2";
    }

    /** 是否上架:0未上架1上架2下架 */
    public static class Shelf {
        public static final String NOT_SHELF = "0";
        public static final String UP_SHELF = "1";
        public static final String OFF_SHELF = "2";
    }

   

    /** 是否为爆款商品: 1是0否 */
    public static class Hot {
        public static final String IS_HOT = "1";
        public static final String NOT_HOT = "0";
    }

    /** 利率点类型: 0固定利率1动态利率 */
    public static class Rate {
        public static final String STATIC_RATE = "0";
        public static final String VARIABLE_RATE = "1";
        
        public static final String DEFAULT_RATE = "0.03";
        public static final String MAX_RATE = "0.97";
        public static final String MIN_RATE = "0.00";
    }

    /** 运费类型:0包邮1不包邮 */
    public static class Freight {
        public static final String FREIGHT_FREE = "0";
        public static final String FREIGHT_NOT_FREE = "1";
    }
    /**
     * 
     *@Title: LkkProductConst.java  
     *@Package cn.ccsn.lk.constant  
     *@Description: 特殊商品
     *@author gaodaojiang@hotmail.com 
     *@date 2019年11月16日 下午12:54:24  
     *@version 1.0.0
     *@Copyright  (c) 2019
     */
    public static class Special {
        public static final String type_消费扶贫 = "1";
    }

}
