package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.CourseClassification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:06
 */
public interface CourseClassificationRepository extends JpaRepository<CourseClassification, String> {
}
