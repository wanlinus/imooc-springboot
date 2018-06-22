package cn.wanlinus.imoocspringboot.domain;

import cn.wanlinus.imoocspringboot.enums.UserLoginCode;

import java.io.Serializable;

/**
 *  
 * 用户状态类
 *
 * @author wanli
 * @date 2018-01-24 10:43
 */
public class UserMsg implements Serializable {
    private UserLoginCode code;
    private User user;

    public UserMsg() {
    }

    public UserMsg(UserLoginCode code, User user) {
        this.code = code;
        this.user = user;
    }

    public UserLoginCode getCode() {
        return code;
    }

    public void setCode(UserLoginCode code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserMsg{" +
                "code=" + code +
                ", user=" + user +
                '}';
    }
}
