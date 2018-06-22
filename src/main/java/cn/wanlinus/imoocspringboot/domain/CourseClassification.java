package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.*;

/**
 * 分类
 *
 * @author wanli
 */
@Entity
@Table(name = "tb_course_classification")
public class CourseClassification {
    @Id
    @Column(name = "cf_id")
    private String id;

    @Column(name = "cf_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "cf_dt_id", referencedColumnName = "dt_id")
    private CourseDirection courseDirection;

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

    public CourseDirection getCourseDirection() {
        return courseDirection;
    }

    public void setCourseDirection(CourseDirection courseDirection) {
        this.courseDirection = courseDirection;
    }
}
