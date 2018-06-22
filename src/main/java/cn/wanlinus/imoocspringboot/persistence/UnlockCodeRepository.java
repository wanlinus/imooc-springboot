package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.UnlockCode;
import cn.wanlinus.imoocspringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:14
 */
public interface UnlockCodeRepository extends JpaRepository<UnlockCode, String> {
}
