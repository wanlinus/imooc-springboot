package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 13:58
 */
@Entity
@Table(name = "tb_note")
public class Note implements Serializable {
    @Id
    @Column(name = "note_id")
    private String id;

    @Column(name = "note_time")
    private Date time;

    @Column(name = "note_content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "note_user_id", referencedColumnName = "user_id")
    private User user;

    public Note() {
    }

    public Note(String id, Date time, String content, User user) {
        this.id = id;
        this.time = time;
        this.content = content;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}
