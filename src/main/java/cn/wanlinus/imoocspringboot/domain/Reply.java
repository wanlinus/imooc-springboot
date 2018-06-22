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
@Table(name = "tb_reply")
public class Reply {
    @Id
    @Column(name = "rp_id")
    private String id;

    @Column(name = "rp_time")
    private Date time;

    @Column(name = "rp_content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "rp_cm_id", referencedColumnName = "cm_id")
    private CourseComment courseComment;

    public Reply() {
    }

    public Reply(String id, Date time, String content, CourseComment courseComment) {
        this.id = id;
        this.time = time;
        this.content = content;
        this.courseComment = courseComment;
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

    public CourseComment getCourseComment() {
        return courseComment;
    }

    public void setCourseComment(CourseComment courseComment) {
        this.courseComment = courseComment;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                ", courseComment=" + courseComment +
                '}';
    }
}
