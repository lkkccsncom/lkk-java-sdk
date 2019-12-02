package cn.ccsn.api.kkm.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class MenuLkk extends CcsnObject{
	
	private static final long serialVersionUID = -1048475123064574492L;

	private Integer menuId;

    private String menuName;

    private String url;

    private String icon;

    private Integer status;

    private Integer sorts;

    private String des;
    
    private Integer menuType;

    private Integer pid;

    private Integer module;

    private Integer dataType;
    
    private String catId;
    private String code;
    private String catType;
    private String special;

    @Tolerate
    public MenuLkk() {}
}