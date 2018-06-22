package cn.wanlinus.imoocspringboot.controller;

import cn.wanlinus.imoocspringboot.domain.ServiceCode;
import cn.wanlinus.imoocspringboot.domain.User;
import cn.wanlinus.imoocspringboot.dto.UserLoginDto;
import cn.wanlinus.imoocspringboot.enums.UserLoginCode;
import cn.wanlinus.imoocspringboot.enums.UserStatusCode;
import cn.wanlinus.imoocspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 关于用户的控制器  
 *
 * @author wanli
 * @date 2018-01-24 15:31
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody UserLoginDto loginDto, HttpSession session, Model model) {
        System.out.println(loginDto.toString());
        ServiceCode<UserLoginCode, User> code = userService.login(loginDto);
        String msg;
        switch (code.getCode()) {
            case USER_NOT_EXIST:
                msg = UserLoginCode.USER_NOT_EXIST.getName();
                break;
            case USER_PASSWORD_ERROR:
                msg = UserLoginCode.USER_PASSWORD_ERROR.getName();
                break;
            case USER_ACCOUNT_RESTRICTION:
                msg = UserLoginCode.USER_ACCOUNT_RESTRICTION.getName();
                break;
            case USER_LOGIN_SUCCESS:
                msg = UserLoginCode.USER_LOGIN_SUCCESS.getName();
                session.setAttribute("code", code);
                break;
            default:
                msg = "未知错误";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        return map;
    }

    @PostMapping("/register")
    public String register() {
        return null;
    }
}
