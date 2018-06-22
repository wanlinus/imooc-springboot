package cn.wanlinus.imoocspringboot.service.impl;

import cn.wanlinus.imoocspringboot.domain.*;
import cn.wanlinus.imoocspringboot.dto.UserActiveDto;
import cn.wanlinus.imoocspringboot.dto.UserLoginDto;
import cn.wanlinus.imoocspringboot.dto.UserRegisterDto;
import cn.wanlinus.imoocspringboot.enums.ActiveCode;
import cn.wanlinus.imoocspringboot.enums.UserLoginCode;
import cn.wanlinus.imoocspringboot.enums.UserStatusCode;
import cn.wanlinus.imoocspringboot.persistence.UnlockCodeRepository;
import cn.wanlinus.imoocspringboot.persistence.UserRepository;
import cn.wanlinus.imoocspringboot.service.UserService;
import cn.wanlinus.imoocspringboot.util.CommonTool;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

/**
 *  用户服务类
 *
 * @author wanli
 * @date 2018-01-23 16:49
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UnlockCodeRepository unlockCodeRepository;

    @Autowired
    private SimpleMailMessage mailMessage;
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public UnlockCode register(UserRegisterDto dto) {
        if (userRepository.findUserByName(dto.getNickname()) == null
                && userRepository.findUserByEmail(dto.getEmail()) == null) {
            User user = new User.Builder(dto.getNickname(), DigestUtils.md5Hex(dto.getPassword()), dto.getEmail()).build();
            UnlockCode code = new UnlockCode(CommonTool.getUUID(), user, new Date(), 30, ActiveCode.ACTIVE_INACTIVE);

            String text = "您的注册验证码为: " + code.getCode() + "请输入到验证区\n" +
                    "或点击<a href='http://y50-70/active-user?userId=" + code.getUser().getId() + "&code=" + code.getCode() + "'>验证用户</a>";
            //发送激活邮件
            sendEmail2User(dto.getEmail(), text);

            userRepository.save(user);
            return unlockCodeRepository.save(code);
        }
        return null;
    }

    @Override
    @Async
    public void sendEmail2User(String emailAddress, String text) {
        mailMessage.setTo(emailAddress);
        mailMessage.setText(text);
        javaMailSender.send(mailMessage);
    }

    @Override
    public boolean checkNickname(String nickname) {
        return userRepository.findUserByNickname(nickname) != null;
    }

    @Override
    public boolean checkEmail(String email) {
        return userRepository.findUserByEmail(email) != null;
    }

    @Override
    public ServiceCode<UserLoginCode, User> login(UserLoginDto dto) {
        User tmp = userRepository.findUserByNickname(dto.getName());

        ServiceCode<UserLoginCode, User> serviceCode = new ServiceCode<>();
        //用户不存在
        if (tmp == null) {
            serviceCode.setCode(UserLoginCode.USER_NOT_EXIST);
            return serviceCode;
        }
        //用户登陆限制
        if (!tmp.getStatus().equals(UserStatusCode.ACTIVATED)) {
            serviceCode.setCode(UserLoginCode.USER_ACCOUNT_RESTRICTION);
            return serviceCode;
        }

        dto.setPassword(DigestUtils.md5Hex(dto.getPassword()));
        if (!tmp.getPassword().equals(dto.getPassword())) {
            serviceCode.setCode(UserLoginCode.USER_PASSWORD_ERROR);
            return serviceCode;
        }
        serviceCode.setCode(UserLoginCode.USER_LOGIN_SUCCESS);
        serviceCode.setEntity(tmp);
        return serviceCode;
    }

    @Override
    public String checkUserStatus(User user) {
        return null;
    }

    @Override
    public ActiveCode activateAccount(UserActiveDto activeDto) {
        User tmp = userRepository.findOne(activeDto.getUserId());
        UnlockCode unlockCode = unlockCodeRepository.findOne(activeDto.getCode());
        if (unlockCode == null ||
                unlockCode.getActive().equals(ActiveCode.ACTIVE_DISABLE) ||
                !unlockCode.getUser().getId().equals(tmp.getId())) {
            return ActiveCode.ACTIVE_DISABLE;
        }
        //时间超时
        if ((unlockCode.getDatetime().getTime() - (new Date()).getTime()) > unlockCode.getValidity() * 60) {
            return ActiveCode.ACTIVE_TIME_OUT;
        }

        //正常激活
        tmp.setStatus(UserStatusCode.ACTIVATED);
        return ActiveCode.ACTIVE_SUCCESS;
    }

    @Override
    public void deleteUser(User user) {
        userRepository.findOne(user.getId()).setStatus(UserStatusCode.DELETED);
    }
}
