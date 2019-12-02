package cn.ccsn;

import java.util.HashMap;
import java.util.Map;

import cn.ccsn.api.constant.CcsnConstants;
import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.util.CcsnSignature;

/**
 * 
 *@Title: SignUtil.java  
 *@Package cn.ccsn  
 *@Description:签名测试
 *@author gaodaojiang@hotmail.com 
 *@date 2019年10月29日 下午8:13:25  
 *@version 1.0.0
 *@Copyright  (c) 2019
 */

public class SignUtil {
	//私钥
	//MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJ5H5DymXopeglmQd5Qmz9OLnSDI7huB2ihWNKFf4B7R2qsCk7RCZy7zfMFcf4cEx3Yu55gOrGeOC3zDWfrDKT7Ork9Gmk9UQwS2tiUZRVewy8wcQE4gd4aQPGIehBFTo/tTfBoBb9OvloNiqkyU0M3LtH0Td4+oH3WQ+1C/pi1bAgMBAAECgYBWCW4fKbAqNsVUOhtGBPLjYvi+YXpMqYEUfAeP0LXbCud6HaR8T7wW4XPnB4iqtAZYT5bEKPW+NJA5+VZn4L4B8r9UD9F4a5pit8uWmDAokyloUHr/ouYbrcCwQya1baYo4Zz4DlkCyuQJyVOTAA2QWQHTg67401xsAOmNT+tOQQJBANZ4DHhDXlzXIBezGiNz4wfGIwHQxTZAh8KDheJQhr5TUJiagf1iz35wBbo87spydVGxy8VqKPnyfe55nIvIEbcCQQC87mhpAO9+KAKdahNE3/65y3TU9vqWH8ekwiFeAzBLL4GRu/vZ2JPx3O2qhAsm+tQlfE66hFBqTO+a/j0S+rF9AkB9SKugJVqeSV0J+yotw6jABdK1YMuToaaszkALsJbF382ZF8kPyAUGC1KNNMMZqDs4efBbZmSBflJqWMhGL52JAkASxSDMZdJlVzZDS1mUuyhEbykxS0REC+46uSq1e12d6p9VyjZQQ0sXeVqHWUz+V2ciPkJYF3MhzHj1jhKlQxDFAkEAkv83QYnuimHGgEIdG1MoW5FhCoTKp/Lo/AmtLrDIwaSvFp0NIQcqnUIeLI+K4D/4uHWQwHQDV08Zf31mx8zINg==
			//公钥
			//MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCeR+Q8pl6KXoJZkHeUJs/Ti50gyO4bgdooVjShX+Ae0dqrApO0Qmcu83zBXH+HBMd2LueYDqxnjgt8w1n6wyk+zq5PRppPVEMEtrYlGUVXsMvMHEBOIHeGkDxiHoQRU6P7U3waAW/Tr5aDYqpMlNDNy7R9E3ePqB91kPtQv6YtWwIDAQAB
	private static String privateKey="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALRx9pZvbAOGndGPhOwmtJ6WxdHqdMHjq3ARkFkdi8uqbAHwCWJtnStbIG/jhXZUpzVkV4yJXUm+2yVKMfT+kTWfso+/3ZB/i5lsw4MklugZdtVDJrXOUbGQt/O1Nup0UDKWoN5eeGdP2MDfyY6FCt9Lel53t+Sv5KF6pJ8vdFQPAgMBAAECgYAGKXYgQQHRRQGSrHH/lnrIh6GNv5HpJRsvoonpYSbq95DkqAvJ/rBFUMFU0NI37kAfhKOwuugioo/dQCFgmmje+xCiqQaJDCWCJ3AcRiB0v7KVeliJXz8kjsDN8ZdlFdh9L33H99BgBpLfG+T/QLyHMGLNMcbidiNNUGtlFm6SsQJBAPqx5Y0P473rhk3REEagc/ujeme49JLSqwkEQuq6pkSCoWmrsbQ4dL6MrD6Yn/piiLdDo6840T9CEYpLvmJ3D/MCQQC4Q3+vWXLMUG0md2Z8a7chVWTRIdVjs6qS/CH9WWpAGEJAEHXraV/QVi7Z6lZvr+V1jxXFDkMjG2sjSHZwmk51AkBeKn5oKyTHjPWIu1Paw6BtUC3FUjMEB3/ZRjGAjBWyPEM3Nxfr8xzfCmYUqS3GVka2WADe63+lvEJsaSEdSU3DAkAJe8fdkX/8DgOgIDMRIkYZnBiFPvWJnRyhVgK11F1IkTcPrwkypYi940GkC5CJTQdFRqj7LGG+M9IOzdLytq5lAkEAqpOxyfEy1bIp+4B+0ZwpLVSO17GeWJtkU3SOjJXZt52GUyCUDjsEDSRBUyZQc6eKmbHFHiwvafi8VoHM4SeU/Q==";
	private static String publicKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC0cfaWb2wDhp3Rj4TsJrSelsXR6nTB46twEZBZHYvLqmwB8AlibZ0rWyBv44V2VKc1ZFeMiV1JvtslSjH0/pE1n7KPv92Qf4uZbMODJJboGXbVQya1zlGxkLfztTbqdFAylqDeXnhnT9jA38mOhQrfS3ped7fkr+SheqSfL3RUDwIDAQAB";
	public static void main(String[] args) throws  CcsnApiException {
		 Map<String, Object> signMap=new HashMap<String, Object>();
		  signMap.put("charset", "UTF-8");
		  signMap.put("biz_content","{\"pageSize\":10,\"page\":1}");
		  signMap.put("format","json");
		  signMap.put("app_id","95e4809ed40f4f3a88c08a823057f924");
		  signMap.put("timestamp","2019-10-29 19:22:13");
		
		  
		  
	 
		  String signContent= CcsnSignature.getSignContent(signMap);
		
		System.err.println(signContent);
    	String  sign=CcsnSignature.rsaSign(signContent,privateKey, CcsnConstants.CHARSET_UTF8, CcsnConstants.SIGN_TYPE_RSA);
	    System.err.println(sign);
		signMap.put(CcsnConstants.SIGN,sign);
		boolean verify_result = CcsnSignature.rsaCheckV1(signMap, publicKey,  CcsnConstants.CHARSET_UTF8, CcsnConstants.SIGN_TYPE_RSA);
		//boolean is=RASUtil.verify(KeyConstant.PUB_KEY.getBytes(), signContent, sign.getBytes());
		System.err.println(verify_result);
		//CZ4gUJG90Ajcf7uVx6+AUs7ZhedBKb4kRRl8d7jWvsgrqUDUTczfa17RVDTz55wuO0ulkjDGzggEmhqMpDftknjkDsZ4Koo7vS753OmnzGRPCTAkJtD2JmZSgiGvrgGFkJL2YBnEr/qht5PLNwHKjYFWZza/sQmK5Lv9NLvbbRY=
	}
}
