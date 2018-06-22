package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;

/**
 * @author wanli
 */
@Entity
@Table(name = "tb_course_video")
public class CourseVideo {
    @Id
    @Column(name = "video_id")
    private String id;
    @Column(name = "video_name")
    private String name;
    @Column(name = "video_duration")
    private Integer duration;
    @Column(name = "video_sha1")
    private String sha1;
    @ManyToOne
    @JoinColumn(name = "video_cs_id", referencedColumnName = "cs_id")
    private Course course;

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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
