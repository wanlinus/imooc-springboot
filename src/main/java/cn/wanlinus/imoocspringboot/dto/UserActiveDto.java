package cn.wanlinus.imoocspringboot.dto;

import java.io.Serializable;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 17:01
 */
public class UserActiveDto implements Serializable {
    /**
     * 用户Id
     */
    private String userId;

    /**
     * 激活码
     */
    private String code;

    public UserActiveDto() {
    }

    public UserActiveDto(String userId, String code) {
        this.userId = userId;
        this.code = code;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
