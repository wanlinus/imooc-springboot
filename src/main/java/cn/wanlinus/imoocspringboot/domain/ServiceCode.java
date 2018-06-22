package cn.wanlinus.imoocspringboot.domain;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-24 13:54
 */
public class ServiceCode<E extends Enum, M> {
    private E code;
    private M entity;

    public ServiceCode() {
    }

    public ServiceCode(E code, M entity) {
        this.code = code;
        this.entity = entity;
    }

    public E getCode() {
        return code;
    }

    public void setCode(E code) {
        this.code = code;
    }

    public M getEntity() {
        return entity;
    }

    public void setEntity(M entity) {
        this.entity = entity;
    }
}
