package cn.wanlinus.imoocspringboot.dto;

import java.io.Serializable;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 16:54
 */
public class UserLoginDto implements Serializable {
    /**
     * 用户登陆账户Id或者是email
     */
    private String name;
    /**
     * 用户登陆类型
     * N 通过Nickname登陆
     * E 通过Email登陆
     */
    private Character type;
    /**
     * 登陆所用的密码
     */
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginDto{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", password='" + password + '\'' +
                '}';
    }
}
