package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:13
 */
//@RepositoryRestResource(path = "teacher")
public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
