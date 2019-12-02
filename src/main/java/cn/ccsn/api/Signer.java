package cn.ccsn.api;

public interface Signer {
	/**
	 * 
	 * @Description:签名
	 * @author gaodaojiang@hotmail.com  
	 * @version 1.0.0
	 * @date 2019年10月29日 上午10:21:34  
	 * @param sourceContent
	 * @param signType
	 * @param charset
	 * @return
	 */
	 String sign(String sourceContent, String signType, String charset);
}
