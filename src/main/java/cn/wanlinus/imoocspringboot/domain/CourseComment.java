package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *  课程评论
 *
 * @author wanli
 * @date 2018-01-23 13:57
 */
@Entity
@Table(name = "tb_course_comment")
public class CourseComment implements Serializable {
    @Id
    @Column(name = "cm_id")
    private String id;

    @Column(name = "cm_time")
    private Date time;

    @Column(name = "cm_content")
    private String content;

    @Column(name = "cm_support")
    private Integer support;

    @ManyToOne
    @JoinColumn(name = "cm_cs_id", referencedColumnName = "cs_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "cm_user_id", referencedColumnName = "user_id")
    private User user;

    public CourseComment() {
    }

    public CourseComment(String id, Date time, String content, Integer support, Course course, User user) {
        this.id = id;
        this.time = time;
        this.content = content;
        this.support = support;
        this.course = course;
        this.user = user;
    }

    @Override
    public String toString() {
        return "CourseComment{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                ", support=" + support +
                ", course=" + course +
                ", user=" + user +
                '}';
    }
}
