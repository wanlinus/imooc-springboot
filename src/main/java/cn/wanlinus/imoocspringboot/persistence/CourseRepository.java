package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:11
 */
//@RepositoryRestResource(path = "course")
public interface CourseRepository extends JpaRepository<Course, String> {
}
