package cn.wanlinus.imoocspringboot.enums;

/**
 *  用户激活返回码
 *
 * @author wanli
 * @date 2018-01-24 13:38
 */
public enum ActiveCode {

    /**
     *
     */
    ACTIVE_SUCCESS("激活成功"),
    ACTIVE_BUST("激活失败"),
    ACTIVE_TIME_OUT("激活超时"),
    ACTIVE_DISABLE("激活码不可用"),
    ACTIVE_INACTIVE("未激活");

    private String name;

    ActiveCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
