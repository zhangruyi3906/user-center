package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {
    /**
     * 用户登录请求体
     *
     */
    private static final long serialVersionUID = 5162710183389028793L;

    private String userPassword;

    private String userAccount;
}
