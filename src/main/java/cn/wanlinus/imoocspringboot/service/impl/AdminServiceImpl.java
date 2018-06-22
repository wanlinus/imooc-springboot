package cn.wanlinus.imoocspringboot.service.impl;

import cn.wanlinus.imoocspringboot.domain.Admin;
import cn.wanlinus.imoocspringboot.domain.ServiceCode;
import cn.wanlinus.imoocspringboot.enums.UserLoginCode;
import cn.wanlinus.imoocspringboot.persistence.AdminRepository;
import cn.wanlinus.imoocspringboot.service.AdminService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-23 16:33
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> showAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public ServiceCode<UserLoginCode, Admin> login(Admin admin) {
        Admin tmp = adminRepository.findAdminByName(admin.getName());
        ServiceCode<UserLoginCode, Admin> serviceCode = new ServiceCode<>();
        //账户不存在
        if (tmp == null) {
            serviceCode.setCode(UserLoginCode.USER_NOT_EXIST);
            return serviceCode;
        }
        //密码错误
        if (!DigestUtils.md5Hex(admin.getPassword()).equals(tmp.getPassword())) {
            serviceCode.setCode(UserLoginCode.USER_PASSWORD_ERROR);
            return serviceCode;
        }
        //登陆成功
        serviceCode.setCode(UserLoginCode.USER_LOGIN_SUCCESS);
        serviceCode.setEntity(tmp);
        return serviceCode;
    }
}
