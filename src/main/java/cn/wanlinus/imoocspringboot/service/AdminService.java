package cn.wanlinus.imoocspringboot.service;

import cn.wanlinus.imoocspringboot.domain.Admin;
import cn.wanlinus.imoocspringboot.domain.ServiceCode;
import cn.wanlinus.imoocspringboot.enums.UserLoginCode;

import javax.xml.ws.Service;
import java.util.List;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 14:16
 */
public interface AdminService {
    /**
     * 显示所有管理员
     *
     * @return 管理员容器
     */
    List<Admin> showAllAdmin();

    /**
     * 管理员登陆
     *
     * @param admin 登陆的管理员
     * @return 完整管理员信息
     */
    ServiceCode<UserLoginCode, Admin> login(Admin admin);

}
