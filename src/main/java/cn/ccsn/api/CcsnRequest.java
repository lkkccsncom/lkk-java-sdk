package cn.ccsn.api;

import java.util.Map;

public interface CcsnRequest <T extends CcsnResponse>{


    /**
     * 获取所有的Key-Value形式的文本请求参数集合。其中：
     * <ul>
     * <li>Key: 请求参数名</li>
     * <li>Value: 请求参数值</li>
     * </ul>
     * 
     * @return 文本请求参数集合
     */
    public Map<String, Object> getTextParams();


    /**
     * 返回通知地址
     * 
     * @return
     */
    public String getNotifyUrl();

    /**
     *  设置通知地址
     * 
     * @param notifyUrl
     */
    public void setNotifyUrl(String notifyUrl);

    /**
     * 返回回跳地址
     * 
     * @return
     */
    public String getReturnUrl();

    /**
     *  设置回跳地址
     * 
     * @param notifyUrl
     */
    public void setReturnUrl(String returnUrl);

    /**
     * 得到当前API的响应结果类型
     * 
     * @return 响应类型
     */
    public Class<T> getResponseClass();

    /**
     * 判断是否需要加密
     * 
     * @return
     */
    public boolean isNeedEncrypt();

    /**
     * 设置请求是否需要加密
     * 
     * @param needEncrypt
     */
    public void setNeedEncrypt(boolean needEncrypt);

    public CcsnObject getBizModel();

    /**
     * 设置业务实体，如需使用此方法，请勿直接设置biz_content
     * 
     * @param bizModel
     */
    public void setBizModel(CcsnObject bizModel);
}
