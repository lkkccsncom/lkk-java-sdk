package cn.ccsn.api;

import cn.ccsn.api.exception.CcsnApiException;
import cn.ccsn.api.util.CcsnSignature;

public class DefaultSigner implements Signer{
	  private String privateKey;

	    public DefaultSigner(String privateKey) {
	        this.privateKey = privateKey;
	    }

	    public String sign(String sourceContent, String signType, String charset) {
	        String sign = null;
	        try {
	            sign = CcsnSignature.rsaSign(sourceContent, this.privateKey, charset, signType);
	        } catch ( CcsnApiException e) {
	            throw new RuntimeException(e);
	        }
	        return sign;
	    }

	    /**
	     * Getter method for property <tt>privateKey</tt>.
	     *
	     * @return property value of privateKey
	     */
	    public String getPrivateKey() {
	        return privateKey;
	    }

	    /**
	     * Setter method for property <tt>privateKey</tt>.
	     *
	     * @param privateKey  value to be assigned to property privateKey
	     */
	    public void setPrivateKey(String privateKey) {
	        this.privateKey = privateKey;
	    }
}
