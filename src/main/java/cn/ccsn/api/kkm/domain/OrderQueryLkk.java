package cn.ccsn.api.kkm.domain;

import cn.ccsn.api.CcsnObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class OrderQueryLkk extends CcsnObject{
	
	private static final long serialVersionUID = -2474454811390814355L;

	private String userId;
	
	private String status;

	private String orderId;
	
    @Tolerate
    public OrderQueryLkk() {}
}