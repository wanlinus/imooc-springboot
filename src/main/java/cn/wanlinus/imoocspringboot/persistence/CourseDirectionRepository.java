package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.CourseDirection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:07
 */
public interface CourseDirectionRepository extends JpaRepository<CourseDirection, String> {
}
