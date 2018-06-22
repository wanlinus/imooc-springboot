package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:03
 */
//@RepositoryRestResource(path = "/answer")
public interface AnswerRepository extends JpaRepository<Answer, String> {
}
