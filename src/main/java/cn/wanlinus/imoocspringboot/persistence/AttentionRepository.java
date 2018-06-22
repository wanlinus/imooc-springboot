package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.Attention;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 16:05
 */
public interface AttentionRepository extends JpaRepository<Attention, String> {
}
