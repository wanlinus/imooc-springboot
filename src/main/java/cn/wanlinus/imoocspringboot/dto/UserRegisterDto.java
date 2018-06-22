package cn.wanlinus.imoocspringboot.dto;

import java.io.Serializable;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 16:51
 */
public class UserRegisterDto implements Serializable {
    /**
     * 用户注册昵称
     */
    private String nickname;
    /**
     * 用户注册邮箱
     */
    private String email;
    /**
     * 用户注册密码
     */
    private String password;

    public UserRegisterDto() {
    }

    public UserRegisterDto(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
