package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wanli
 */
@Entity
@Table(name = "tb_teacher")
public class Teacher {
    @Id
    @Column(name = "thr_id")
    private String id;

    @Column(name = "thr_name")
    private String name;

    @Column(name = "thr_password")
    private String password;

    @Column(name = "thr_gender")
    private Character gender;

    @Column(name = "thr_position")
    private String position;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
