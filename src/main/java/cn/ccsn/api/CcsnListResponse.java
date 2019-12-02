package cn.ccsn.api;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public   class CcsnListResponse<T> extends CcsnResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private     List<T> rows;
	
	
	
}
