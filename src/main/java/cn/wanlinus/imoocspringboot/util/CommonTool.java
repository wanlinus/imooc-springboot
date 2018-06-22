package cn.wanlinus.imoocspringboot.util;

import java.util.UUID;

/**
 * @author wanli
 */
public final class CommonTool {
    private CommonTool() {
        throw new AssertionError();
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    public static void main(String[] args) {
        System.out.println(CommonTool.getUUID());
    }
}
