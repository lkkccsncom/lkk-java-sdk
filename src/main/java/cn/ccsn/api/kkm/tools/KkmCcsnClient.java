package cn.ccsn.api.kkm.tools;



import java.util.Map;

import cn.ccsn.api.CcsnRequest;
import cn.ccsn.api.CcsnResponse;
import cn.ccsn.api.exception.CcsnApiException;

public interface KkmCcsnClient {
	
	  public <T extends CcsnResponse> T execute(CcsnRequest<T> request, Map<String,Object> params) throws CcsnApiException;
	  public <T extends CcsnResponse> T execute(CcsnRequest<T> request, Map<String, Object> params,  String httpMethod) 
			  throws CcsnApiException;
}
