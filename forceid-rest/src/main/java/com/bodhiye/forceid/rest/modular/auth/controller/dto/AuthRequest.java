package com.bodhiye.forceid.rest.modular.auth.controller.dto;

import com.bodhiye.forceid.rest.modular.auth.validator.dto.Credence;
import com.bodhiye.forceid.rest.modular.auth.validator.dto.Credence;

/**
 * 认证的请求dto
 *
 * @author bodhiye
 * @Date 2018/5/24 14:00
 */
public class AuthRequest implements Credence {

    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String getCredenceName() {
        return this.userName;
    }

    @Override
    public String getCredenceCode() {
        return this.password;
    }
}
