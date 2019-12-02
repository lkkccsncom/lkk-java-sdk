package cn.ccsn.api.domain.query;

import cn.ccsn.api.domain.Query;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询我的商品
 * @author 郭太林
 * @Description
 * @date 2019/10/24 0024
 */
@Getter
@Setter
public class MyProductQuery  extends Query{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5307776137338430930L;
	
	/** 商品编号 */
	private String productno;
	/** 标题名称 */
	private String title;
	/** 是否上架:0未上架1上架2下架 */
	private String shelf;
	/** 商品类目编号 */
	private String category;
	/** 商品类类型 */
	private String type;
}
