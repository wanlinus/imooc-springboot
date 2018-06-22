package cn.wanlinus.imoocspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 *  
 *
 * @author wanli
 * @date 2018-01-24 15:05
 */
@Configuration
public class SimpleMailConfig {

    @Bean
    SimpleMailMessage simpleMailMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("wanlinus@qq.com");
        message.setSubject("注册激活码");
        return message;
    }

    @Bean
    JavaMailSenderImpl javaMailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost("smtp.qq.com");
        sender.setUsername("wanlinus");
        sender.setPassword("xrqljmgwmicdbbhj");
        return sender;
    }


}
