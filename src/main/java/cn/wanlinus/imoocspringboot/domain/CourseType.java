package cn.wanlinus.imoocspringboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author wanli
 */
@Entity
@Table(name = "tb_course_type")
public class CourseType implements Serializable {
    @Id
    @Column(name = "ct_id")
    private String id;
    @Column(name = "ct_name")
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
