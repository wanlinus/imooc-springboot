package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.CourseVideo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:13
 */
public interface CourseVideoRepository extends JpaRepository<CourseVideo, String> {
}
