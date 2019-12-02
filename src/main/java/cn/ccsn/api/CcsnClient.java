package cn.ccsn.api;



import cn.ccsn.api.exception.CcsnApiException;

public interface CcsnClient {
	
	  public <T extends CcsnResponse> T execute(CcsnRequest<T> request) throws CcsnApiException;
	  public <T extends CcsnResponse> T execute(CcsnRequest<T> request,  String httpMethod) throws CcsnApiException;
}
