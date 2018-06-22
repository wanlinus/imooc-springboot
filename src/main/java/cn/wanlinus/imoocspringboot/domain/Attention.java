package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;

/**
 *  关注
 *
 * @author wanli
 * @date 2018-01-23 13:56
 */
@Entity
@Table(name = "tb_attention")
public class Attention {
    @Id
    @Column(name = "ate_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "ate_user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ate_thr_id")
    private Teacher teacher;

    public Attention() {
    }

    public Attention(String id, User user, Teacher teacher) {
        this.id = id;
        this.user = user;
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Attention{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", teacher=" + teacher +
                '}';
    }
}
