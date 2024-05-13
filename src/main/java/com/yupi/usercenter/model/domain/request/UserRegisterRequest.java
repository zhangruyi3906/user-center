package com.yupi.usercenter.model.domain.request;

import lombok.Data;
import org.apache.ibatis.javassist.SerialVersionUID;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author zhangruyi
 */
@Data
public class UserRegisterRequest implements Serializable{
    //serializable
    private static final long serialVersionUID = 5162710183389028794L;
    private String userAccount;

    private String userPassword;

    private String checkPassword;


}
