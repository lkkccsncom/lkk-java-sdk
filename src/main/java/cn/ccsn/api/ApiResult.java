package cn.ccsn.api;

import com.alibaba.fastjson.JSONObject;


/**
 * 封装微信api返回结果, 输出实体类
 * 
 * @author 凡梦星尘(elkan1788@gmail.com)
 * @since 2.0
 */
public class ApiResult {



    private JSONObject content;
    private String json;
	private String status;
	
	private String message;
	 private JSONObject rows;

    public ApiResult(String json) {
        this.json = json;
        this.content =JSONObject.parseObject(json);;
        this.status =this.content.getString("status");
        this.message = this.content.getString("message");
        this.rows =  this.content.getJSONObject("rows");

       
    }

    public static ApiResult create(String json) {
        return new ApiResult(json);
    }

	public JSONObject getContent() {
		return content;
	}

	public void setContent(JSONObject content) {
		this.content = content;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

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

	public JSONObject getRows() {
		return rows;
	}

	public void setRows(JSONObject rows) {
		this.rows = rows;
	}


    public boolean isSuccess() {
    	if(this.status ==null) {
    		return false;
    	}
    	if(this.status.equalsIgnoreCase("0")) {
    		return true;
    	}
        return false;
    }
   

}
