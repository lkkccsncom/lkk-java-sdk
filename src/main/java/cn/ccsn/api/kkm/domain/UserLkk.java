package cn.ccsn.api.kkm.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import cn.ccsn.api.CcsnObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

@Getter
@Setter
public class UserLkk extends CcsnObject{
	
	private static final long serialVersionUID = -5151105851451224856L;

	private Integer userId;

    private String userName;

    private String fullName;

    private String pwd;

    private String pwdSalt;

    private String mobile;

    //private Date createDate;

    private Integer createUserId;

    //private Date lastLoginTime;

    private String avatar;

    private String email;

    //private Integer gender;

    //private Date birthday;
    
    private String birthdayStr;

    private Integer score;

    private Integer grage;

    private Integer credit;

    private String extendCode;

    private Integer pid;

    private String token;

    private Integer trackStatus;

    private Integer status;

    private Integer dataType;

    private Integer userType;

    private Integer merchantId;
    
    private Integer fromSource;
    
    private String fromSourceCode;
    
    private String qrCode;
    
    //注册相关
    /**
     * *验证码
     */
    private String mcode;
    
    /**
     * 用于更换手机号
     */
    private String oldMobile;
    
    // 备注
    private String remarks;
    
}