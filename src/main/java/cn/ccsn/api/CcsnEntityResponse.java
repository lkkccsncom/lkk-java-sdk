package cn.ccsn.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public   class CcsnEntityResponse<T> extends CcsnResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private     T rows;
	
	
	
}
