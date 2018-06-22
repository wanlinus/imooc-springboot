package cn.wanlinus.imoocspringboot.persistence;

import cn.wanlinus.imoocspringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:14
 */
//@RepositoryRestResource(path = "/user")
public interface UserRepository extends JpaRepository<User, String> {
    /**
     * 通过用户名查找用户
     *
     * @param name 用户名
     * @return 查找到的用户
     */
    User findUserByName(String name);

    /**
     * 通过邮箱查找用户
     *
     * @param email 用户邮箱
     * @return 查找到的用户
     */
    User findUserByEmail(String email);

    /**
     * 通过昵称查找用户
     *
     * @param nickname 用户昵称
     * @return 返回查找到的用户
     */
    User findUserByNickname(String nickname);
}
