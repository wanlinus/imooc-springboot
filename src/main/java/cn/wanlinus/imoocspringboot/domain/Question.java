package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:00
 */
@Entity
@Table(name = "tb_question")
public class Question implements Serializable {
    @Id
    @Column(name = "qt_id")
    private String id;

    @Column(name = "qt_time")
    private Date time;

    @Column(name = "qt_content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "qt_user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "qt_thr_id", referencedColumnName = "thr_id")
    private Teacher teacher;

    public Question() {
    }

    public Question(String id, Date time, String content, User user, Teacher teacher) {
        this.id = id;
        this.time = time;
        this.content = content;
        this.user = user;
        this.teacher = teacher;
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
}

