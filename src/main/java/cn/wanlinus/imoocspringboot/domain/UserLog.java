package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;
import java.util.Date;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:01
 */
@Entity
@Table(name = "tb_user_log")
public class UserLog {
    @Id
    @Column(name = "ulog_id")
    private String id;

    @Column(name = "ulog_operation")
    private String operation;

    @Column(name = "ulog_time")
    private Date time;

    @ManyToOne
    @JoinColumn(name = "ulog_user_id", referencedColumnName = "user_id")
    private User user;

    public UserLog() {
    }

    public UserLog(String id, String operation, Date time, User user) {
        this.id = id;
        this.operation = operation;
        this.time = time;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "id='" + id + '\'' +
                ", operation='" + operation + '\'' +
                ", time=" + time +
                ", user=" + user +
                '}';
    }
}
