package cn.wanlinus.imoocspringboot.enums;

/**
 *  用户登陆返回码
 *
 * @author wanli
 * @date 2018-01-24 11:42
 */
public enum UserLoginCode {
    /**
     * 用户登陆状态
     */
    USER_NOT_EXIST("用户不存在"),
    USER_PASSWORD_ERROR("密码错误"),
    USER_ACCOUNT_RESTRICTION("账户登陆限制"),
    USER_LOGIN_SUCCESS("登陆成功");

    private String name;

    UserLoginCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
