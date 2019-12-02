package cn.ccsn.api.kkm.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

@Data
@EqualsAndHashCode(callSuper=false)
@Builder
public class UserAddrLkk extends CcsnObject{
	
	private static final long serialVersionUID = -8373626228936277438L;

	private Integer uaId;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String areaCode;

    private String areaName;

    private String addr;

    private String postcode;

    private String mobile;

    private Integer isDefault;

    private String name;

    private String userId;

    @Tolerate
    public UserAddrLkk() {}
}