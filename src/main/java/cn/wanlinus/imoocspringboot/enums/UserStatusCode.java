package cn.wanlinus.imoocspringboot.enums;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-24 11:06
 */
public enum UserStatusCode {
    /**
     * 用户激活状态
     */
    INACTIVE("用户未激活激活"),
    ACTIVATED("已激活"),
    DELETED("用户已删除"),
    UNKNOWN("位置状态");

    /**
     * 状态码名字
     */
    private String name;

    UserStatusCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
