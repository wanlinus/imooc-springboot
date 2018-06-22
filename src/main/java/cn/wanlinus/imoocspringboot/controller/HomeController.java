package cn.wanlinus.imoocspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-24 15:36
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
