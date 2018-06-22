package cn.wanlinus.imoocspringboot.service;

import cn.wanlinus.imoocspringboot.domain.UnlockCode;
import cn.wanlinus.imoocspringboot.dto.UserActiveDto;
import cn.wanlinus.imoocspringboot.dto.UserLoginDto;
import cn.wanlinus.imoocspringboot.dto.UserRegisterDto;
import cn.wanlinus.imoocspringboot.enums.UserLoginCode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-24 09:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class UserServiceTest {

    private Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Before
    public void before() {

    }

    @Test
    public void register() {
        UserRegisterDto userRegisterDto = new UserRegisterDto("wanli", "wanlinus@qq.com", "123456");
        Assert.assertNotEquals(null, userService.register(userRegisterDto));
    }

    @Test
    public void login() {
        UserRegisterDto userRegisterDto = new UserRegisterDto("wanli", "960096286@qq.com", "123456");
        UnlockCode unlockCode = userService.register(userRegisterDto);
        Assert.assertNotEquals(null, unlockCode);

        UserLoginDto userLoginDto = new UserLoginDto();
        userLoginDto.setName("aaa");
        userLoginDto.setPassword("111111");
        Assert.assertEquals(UserLoginCode.USER_NOT_EXIST, userService.login(userLoginDto).getCode());

        userLoginDto.setName("wanli");
        Assert.assertEquals(UserLoginCode.USER_ACCOUNT_RESTRICTION, userService.login(userLoginDto).getCode());

        userService.activateAccount(new UserActiveDto(unlockCode.getUser().getId(), unlockCode.getCode()));

        Assert.assertEquals(UserLoginCode.USER_PASSWORD_ERROR, userService.login(userLoginDto).getCode());

        userLoginDto.setPassword("123456");
        Assert.assertEquals(UserLoginCode.USER_LOGIN_SUCCESS, userService.login(userLoginDto).getCode());

    }

}
