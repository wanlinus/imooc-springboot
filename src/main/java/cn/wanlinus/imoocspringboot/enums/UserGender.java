package cn.wanlinus.imoocspringboot.enums;

/**
 *  用户性别
 *
 * @author wanli
 * @date 2018-01-24 11:19
 */
public enum UserGender {
    /**
     * 性别定义
     */
    MAN("男"),
    WOMAN("女"),
    UNKNOWN("未知");

    private String name;

    UserGender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
