package cn.ccsn.api;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.ccsn.api.constant.CcsnConstants;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.request.RequestParametersHolder;
import cn.ccsn.api.util.CcsnSignature;



public class DefaultCcsnClient implements CcsnClient {
	/**
	 * 地址
	 */
	private String serverUrl;
	/**
	 * 应用ID
	 */
	private String  appId;
    /**
     * 返回数据格式
     * 仅支持JSON
     */
	private String  format=CcsnConstants.FORMAT_JSON;
    /**
     * 请求使用的编码格式，如utf-8,gbk,gb2312等
     * 仅支持utf-8
     */
	private String charset=CcsnConstants.CHARSET_UTF8;
    /**
     * 目前支持RSA2和RSA，推荐使用RSA2
     */
	private String signType=CcsnConstants.SIGN_TYPE_RSA;
    /**
     * 签名串
     */
	private  String sign;
    /**
     * 时间
     */
	private  String timestamp;
	/**
	 * 请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
	 */
	private  String bizContent;
	/**
	 * 应用私钥
	 */
	private String privateKey;
	/**
	 * 平台公钥
	 */
    private String ccsnPublicKey;
    /**
     * AES 密钥
     */
    private String encryptKey;
    /**
     * 签名
     */
    private Signer signer;
    
	public DefaultCcsnClient(String serverUrl, String appId, String privateKey, String ccsnPublicKey) {
		super();
		this.serverUrl = serverUrl;
		this.appId = appId;
		this.privateKey = privateKey;
		this.ccsnPublicKey = ccsnPublicKey;
		this.signer = new DefaultSigner(privateKey);
	}
	public DefaultCcsnClient(String serverUrl, String appId, String privateKey, String ccsnPublicKey,String signType) {
		super();
		this.serverUrl = serverUrl;
		this.appId = appId;
		this.privateKey = privateKey;
		this.ccsnPublicKey = ccsnPublicKey;
		this.signType = signType;
		this.signer = new DefaultSigner(privateKey);
	}
	@Override
	public <T extends CcsnResponse> T execute(CcsnRequest<T> request) throws CcsnApiException {
		return execute(request, "POST");
	}
	
	@Override
	public <T extends CcsnResponse> T execute(CcsnRequest<T> request,  String httpMethod) throws CcsnApiException {
	            Class<T> clazz = request.getResponseClass();
		       /* T rsp = null;
	            try {
					rsp = clazz.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}*/
	            RequestParametersHolder requestHolder =  getRequestHolderWithSign(request);
	            Map<String, Object> params=requestHolder.getApplicationParams();
	            params.put(CcsnConstants.SIGN_TYPE, this.signType);
	        //	boolean verify_result = CcsnSignature.rsaCheckV1(requestHolder.getApplicationParams(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC0cfaWb2wDhp3Rj4TsJrSelsXR6nTB46twEZBZHYvLqmwB8AlibZ0rWyBv44V2VKc1ZFeMiV1JvtslSjH0/pE1n7KPv92Qf4uZbMODJJboGXbVQya1zlGxkLfztTbqdFAylqDeXnhnT9jA38mOhQrfS3ped7fkr+SheqSfL3RUDwIDAQAB",  CcsnConstants.CHARSET_UTF8,  this.signType);
				//System.err.println(verify_result);
	          String content= HttpTool.post(this.serverUrl,params);
	         return JSONObject.parseObject(content,clazz) ;
	         
	       /* if ("GET".equalsIgnoreCase(httpMethod)) {
	        	 ApiResult ar=ApiResult.create(HttpTool.get(this.serverUrl)) ;
	        	 if (ar.isSuccess()) {
	        		  String rows= JSONObject.toJSONString(ar.getRows());
		                return JSONObject.parseObject(rows,clazz) ;
		            }
		        	if (!ar.getStatus().equals("0")) {
		            	//throw new BusinessException(ar.getStatus(),ar.getMessage());
		            }
	        } else {
	          //  String baseUrl = getRequestUrl(requestHolder);
	           // rsp.setBody(WebUtils.buildForm(baseUrl, requestHolder.getApplicationParams()));
	        }*/
	}
	 private <T extends CcsnResponse> RequestParametersHolder getRequestHolderWithSign(CcsnRequest<?> request) throws CcsnApiException {
			RequestParametersHolder requestHolder = new RequestParametersHolder();
			Map<String, Object> appParams = request.getTextParams();
			if (StringUtils.isEmpty(charset)) {
				charset = CcsnConstants.CHARSET_UTF8;
			}
			appParams.put(CcsnConstants.APP_ID, this.appId);
			appParams.put(CcsnConstants.FORMAT, this.format);
			appParams.put(CcsnConstants.CHARSET, this.charset);
			//appParams.put(CcsnConstants.SIGN_TYPE, this.signType);
			try {
				if (request.getClass().getMethod("getBizContent") !=null && StringUtils.isEmpty(String.valueOf(appParams.get(CcsnConstants.BIZ_CONTENT_KEY)))&& request.getBizModel() != null) {
				appParams.put(CcsnConstants.BIZ_CONTENT_KEY,JSONObject.toJSONString(request.getBizModel()));
				}
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
			Long timestamp = System.currentTimeMillis();
			DateFormat df = new SimpleDateFormat(CcsnConstants.DATE_TIME_FORMAT);
			df.setTimeZone(TimeZone.getTimeZone(CcsnConstants.DATE_TIMEZONE));
			appParams.put(CcsnConstants.TIMESTAMP, df.format(new Date(timestamp)));
		    if (!StringUtils.isEmpty(this.signType)) {
			String signContent = CcsnSignature.getSignContent(appParams);
			appParams.put(CcsnConstants.SIGN, getSigner().sign(signContent, this.signType, charset));
			
			} else {
				appParams.put(CcsnConstants.SIGN, "");
			}
			if (request.isNeedEncrypt()) {
				if (StringUtils.isEmpty(String.valueOf(appParams.get(CcsnConstants.BIZ_CONTENT_KEY)))) {
				   throw new CcsnApiException("参数不能为空");
				}
			}
			requestHolder.setApplicationParams(appParams);
		
			return requestHolder;
		}

	/* private <T extends CcsnResponse> RequestParametersHolder getRequestHolderWithSign(CcsnRequest<?> request) throws CcsnApiException {
			RequestParametersHolder requestHolder = new RequestParametersHolder();
			Map<String, String> appParams = request.getTextParams();
			
			
			if (request.getClass().getMethod("getBizContent") !=null && StringUtils.isEmpty(appParams.get(CcsnConstants.BIZ_CONTENT_KEY))&& request.getBizModel() != null) {
			appParams.put(CcsnConstants.BIZ_CONTENT_KEY,JSONObject.toJSONString(request.getBizModel()));
			}
			
			
		
			if (request.isNeedEncrypt()) {
			
			if (StringUtils.isEmpty(appParams.get(CcsnConstants.BIZ_CONTENT_KEY))) {
			
			throw new CcsnApiException("参数不能为空");
			}
			
			// ��Ҫ���ܱ���������Կ�ͼ����㷨
			if (StringUtils.isEmpty(this.encryptType) || getEncryptor() == null) {
			
			throw new CcsnApiException("API����Ҫ����ܣ������������Կ���ͺͼ�����");
			}
			
			String encryptContent = getEncryptor().encrypt(
			appParams.get(AlipayConstants.BIZ_CONTENT_KEY), this.encryptType, this.charset);
			
			appParams.put(AlipayConstants.BIZ_CONTENT_KEY, encryptContent);
			}
			
			if (!StringUtils.isEmpty(appAuthToken)) {
			appParams.put(AlipayConstants.APP_AUTH_TOKEN, appAuthToken);
			}
			
			requestHolder.setApplicationParams(appParams);
			
			if (StringUtils.isEmpty(charset)) {
			charset = AlipayConstants.CHARSET_UTF8;
			}
			
			Map<String, String> protocalMustParams = new HashMap<String, String>();
			//protocalMustParams.put(CcsnConstants.METHOD, request.getApiMethodName());
		//	protocalMustParams.put(AlipayConstants.VERSION, request.getApiVersion());
			protocalMustParams.put(CcsnConstants.APP_ID, this.appId);
			protocalMustParams.put(CcsnConstants.SIGN_TYPE, this.signType);
			//protocalMustParams.put(CcsnConstants.TERMINAL_TYPE, request.getTerminalType());
			//protocalMustParams.put(AlipayConstants.TERMINAL_INFO, request.getTerminalInfo());
			protocalMustParams.put(CcsnConstants.NOTIFY_URL, request.getNotifyUrl());
			protocalMustParams.put(CcsnConstants.RETURN_URL, request.getReturnUrl());
			protocalMustParams.put(CcsnConstants.CHARSET, charset);
			
			if (request.isNeedEncrypt()) {
			protocalMustParams.put(CcsnConstants.ENCRYPT_TYPE, this.encryptType);
			}
			
			Long timestamp = System.currentTimeMillis();
			DateFormat df = new SimpleDateFormat(CcsnConstants.DATE_TIME_FORMAT);
			df.setTimeZone(TimeZone.getTimeZone(CcsnConstants.DATE_TIMEZONE));
			protocalMustParams.put(CcsnConstants.TIMESTAMP, df.format(new Date(timestamp)));
			requestHolder.setProtocalMustParams(protocalMustParams);
			
			Map<String, String>  protocalOptParams =new HashMap<String, String>();
			protocalOptParams.put(CcsnConstants.FORMAT, format);
			//protocalOptParams.put(CcsnConstants.ACCESS_TOKEN, accessToken);
			//protocalOptParams.put(CcsnConstants.ALIPAY_SDK, AlipayConstants.SDK_VERSION);
		//	protocalOptParams.put(AlipayConstants.PROD_CODE, request.getProdCode());
			requestHolder.setProtocalOptParams(protocalOptParams);
			
			if (!StringUtils.isEmpty(this.signType)) {
			
			String signContent = CcsnSignature.getSignatureContent(requestHolder);
			protocalMustParams.put(CcsnConstants.SIGN,getSigner().sign(signContent, this.signType, charset));
			
			} else {
			protocalMustParams.put(CcsnConstants.SIGN, "");
			}
			return requestHolder;
		}*/
	public String getServerUrl() {
		return serverUrl;
	}
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getBizContent() {
		return bizContent;
	}
	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getCcsnPublicKey() {
		return ccsnPublicKey;
	}
	public void setCcsnPublicKey(String ccsnPublicKey) {
		this.ccsnPublicKey = ccsnPublicKey;
	}
	public String getEncryptKey() {
		return encryptKey;
	}
	public void setEncryptKey(String encryptKey) {
		this.encryptKey = encryptKey;
	}

	public Signer getSigner() {
		return signer;
	}

	public void setSigner(Signer signer) {
		this.signer = signer;
	}


	/*@Override
	public OauthAccessTokenResult getAccessToken(String code) {
		  String url=String.format(clientConfig.getOauthAccessToken(),  this.client_id, this.client_secret,code);
		  ApiResult ar = null;
	        for (int i = 0; i < RETRY_COUNT; i++) {
	        	ar=ApiResult.create(HttpTool.get(url)) ;
	        	if (ar.isSuccess()) {
        		  String rows= JSONObject.toJSONString(ar.getRows());
	                return JSONObject.parseObject(rows, OauthAccessTokenResult.class) ;
	            }
	        	if (!ar.getStatus().equals(ErrorCode.SUCCESS.getCode())) {
	            	throw new BusinessException(ar.getStatus(),ar.getMessage());
	            }
	        }
         return null;
	}*/



}
