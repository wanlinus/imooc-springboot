package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 方向
 *
 * @author wanli
 */
@Entity
@Table(name = "tb_course_direction")
public class CourseDirection {
    @Id
    @Column(name = "dt_id")
    private String id;

    @Column(name = "dt_name")
    private String name;

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
}
