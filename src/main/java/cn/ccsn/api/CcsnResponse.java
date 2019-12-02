package cn.ccsn.api;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;




public abstract class CcsnResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -518818868551045998L;
	
	private String status;
 	private String message;
   

    private String              body;
    private Map<String, String> params;

 

    public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}



	public Map<String, String> getParams() {
		return params;
	}



	public void setParams(Map<String, String> params) {
		this.params = params;
	}



	public boolean isSuccess() {
        return StringUtils.isNotBlank(status);
    }
}
