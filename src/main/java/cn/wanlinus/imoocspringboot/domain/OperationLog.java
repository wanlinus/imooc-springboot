package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;
import java.util.Date;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:00
 */
@Entity
@Table(name = "tb_operation_log")
public class OperationLog {
    @Id
    @Column(name = "oper_id")
    private String id;

    @Column(name = "oper_time")
    private Date time;

    @Column(name = "oper_content")
    private String content;

    @Column(name = "oper_city")
    private String city;

    @Column(name = "oper_ip")
    private String ip;

    @Column(name = "oper_equipment")
    private String equipment;

    @ManyToOne
    @JoinColumn(name = "oper_user_id", referencedColumnName = "user_id")
    private User user;

    public OperationLog() {
    }

    public OperationLog(String id, Date time, String content, String city, String ip, String equipment, User user) {
        this.id = id;
        this.time = time;
        this.content = content;
        this.city = city;
        this.ip = ip;
        this.equipment = equipment;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OperationLogRepository{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                ", city='" + city + '\'' +
                ", ip='" + ip + '\'' +
                ", equipment='" + equipment + '\'' +
                ", user=" + user +
                '}';
    }
}
