package cn.ccsn.api;

public class SignItem {

    /**
     * 签名源串
     */
    private String            signSourceDate;

    /**
     * 签名
     */
    private String            sign;

    /**
     * Getter method for property <tt>signSourceDate</tt>.
     * 
     * @return property value of signSourceDate
     */
    public String getSignSourceDate() {
        return signSourceDate;
    }

    /**
     * Setter method for property <tt>signSourceDate</tt>.
     * 
     * @param signSourceDate value to be assigned to property signSourceDate
     */
    public void setSignSourceDate(String signSourceDate) {
        this.signSourceDate = signSourceDate;
    }

    /**
     * Getter method for property <tt>sign</tt>.
     * 
     * @return property value of sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * Setter method for property <tt>sign</tt>.
     * 
     * @param sign value to be assigned to property sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }
}
