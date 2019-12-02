package cn.ccsn.api.kkm.tools;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.CcsnClient;
import cn.ccsn.api.CcsnRequest;
import cn.ccsn.api.CcsnResponse;
import cn.ccsn.api.constant.CcsnConstants;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.RequestParametersHolder;

public class KkmDefaultCcsnClient implements CcsnClient {
	/**
	 * 地址
	 */
	private String serverUrl;

	public KkmDefaultCcsnClient(String serverUrl) {
		super();
		this.serverUrl = serverUrl;

	}

	@Override
	public <T extends CcsnResponse> T execute(CcsnRequest<T> request)
			throws CcsnApiException {
		return execute(request, "POST");
	}

	@Override
	public <T extends CcsnResponse> T execute(CcsnRequest<T> request, String httpMethod)
			throws CcsnApiException {
		Class<T> clazz = request.getResponseClass();
		 RequestParametersHolder requestHolder =  getRequestHolderWithSign(request);
         Map<String, Object> params=requestHolder.getApplicationParams();
        String body=  (String) params.get(CcsnConstants.BIZ_CONTENT_KEY);
		String content = KkmHttpTool.post(this.serverUrl, body);
		return JSONObject.parseObject(content, clazz);
	}
	 private <T extends CcsnResponse> RequestParametersHolder getRequestHolderWithSign(CcsnRequest<?> request) throws CcsnApiException {
			RequestParametersHolder requestHolder = new RequestParametersHolder();
			Map<String, Object> appParams = request.getTextParams();
			try {
				if (request.getClass().getMethod("getBizContent") !=null && StringUtils.isEmpty(String.valueOf(appParams.get(CcsnConstants.BIZ_CONTENT_KEY)))&& request.getBizModel() != null) {
				  appParams.put(CcsnConstants.BIZ_CONTENT_KEY,JSONObject.toJSONString(request.getBizModel()));
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
			
			requestHolder.setApplicationParams(appParams);
		
			return requestHolder;
		}
	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
}
