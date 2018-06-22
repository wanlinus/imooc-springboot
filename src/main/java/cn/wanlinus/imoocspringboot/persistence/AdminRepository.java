package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:02
 */
@RepositoryRestResource(path = "/admin")
public interface AdminRepository extends JpaRepository<Admin, String> {
    /**
     * 通过管理员姓名或Email查找管理员
     *
     * @param name 管理员姓名
     * @return 管理员对象
     */
    Admin findAdminByName(String name);
}
