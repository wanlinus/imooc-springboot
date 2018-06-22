package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;

/**
 * 课程
 *
 * @author wanli
 */
@Entity
@Table(name = "tb_course")
public class Course {
    @Id
    @Column(name = "cs_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "cs_thr_id", referencedColumnName = "thr_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "cs_cf_id", referencedColumnName = "cf_id")
    private CourseClassification classification;

    @ManyToOne
    @JoinColumn(name = "cs_ct_id", referencedColumnName = "ct_id")
    private CourseType courseType;

    @Column(name = "cs_name")
    private String name;

    /**
     * 课程资费
     */
    @Column(name = "cs_tariff")
    private Double tariff;

    /**
     * 难度等级
     */
    @Column(name = "cs_grade")
    private Character grade;

    /**
     * 时长
     */
    @Column(name = "cs_duration")
    private String duration;

    /**
     * 评分
     */
    @Column(name = "cs_score")
    private Double score;

    /**
     * 课程须知
     */
    @Column(name = "cs_notice")
    private String notice;

    /**
     * 能学到什么
     */
    @Column(name = "cs_wtcanlearn")
    private String wtcanlearn;

    /**
     * 封面
     */
    @Column(name = "cs_image")
    private String image;

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public CourseClassification getClassification() {
        return classification;
    }

    public void setClassification(CourseClassification classification) {
        this.classification = classification;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTariff() {
        return tariff;
    }

    public void setTariff(Double tariff) {
        this.tariff = tariff;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getWtcanlearn() {
        return wtcanlearn;
    }

    public void setWtcanlearn(String wtcanlearn) {
        this.wtcanlearn = wtcanlearn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", teacher=" + teacher +
                ", classification=" + classification +
                ", courseType=" + courseType +
                ", name='" + name + '\'' +
                ", tariff=" + tariff +
                ", grade=" + grade +
                ", duration='" + duration + '\'' +
                ", score=" + score +
                ", notice='" + notice + '\'' +
                ", wtcanlearn='" + wtcanlearn + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
