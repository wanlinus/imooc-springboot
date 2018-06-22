package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.CourseComment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 16:06
 */
public interface CourseCommentRepository extends JpaRepository<CourseComment, String> {
}
