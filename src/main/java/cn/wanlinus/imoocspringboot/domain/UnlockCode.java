package cn.wanlinus.imoocspringboot.domain;

import cn.wanlinus.imoocspringboot.enums.ActiveCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 解锁码
 *
 * @author wanli
 */
@Entity
@Table(name = "tb_unlock_code")
public class UnlockCode implements Serializable {
    @Id
    @Column(name = "uc_id")
    private String code;

    @ManyToOne
    @JoinColumn(name = "uc_user_id", referencedColumnName = "user_id")
    private User user;

    @Column(name = "uc_time")
    private Date datetime;

    @Column(name = "uc_validity")
    private Integer validity;

    @Column(name = "uc_active")
    private ActiveCode active;

    public UnlockCode() {
    }

    public UnlockCode(String code, User user, Date datetime, Integer validity, ActiveCode active) {
        this.code = code;
        this.user = user;
        this.datetime = datetime;
        this.validity = validity;
        this.active = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public ActiveCode getActive() {
        return active;
    }

    public void setActive(ActiveCode active) {
        this.active = active;
    }
}
