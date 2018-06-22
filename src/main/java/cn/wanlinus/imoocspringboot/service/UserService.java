package cn.wanlinus.imoocspringboot.service;


import cn.wanlinus.imoocspringboot.domain.ServiceCode;
import cn.wanlinus.imoocspringboot.domain.UnlockCode;
import cn.wanlinus.imoocspringboot.domain.User;
import cn.wanlinus.imoocspringboot.dto.UserActiveDto;
import cn.wanlinus.imoocspringboot.dto.UserLoginDto;
import cn.wanlinus.imoocspringboot.dto.UserRegisterDto;
import cn.wanlinus.imoocspringboot.enums.ActiveCode;
import cn.wanlinus.imoocspringboot.enums.UserLoginCode;

/**
 * @author wanli
 */
public interface UserService {

    /**
     * 用户注册,传入一个用户注册传输对象
     * 生成一个验证码对象
     *
     * @param dto 注册用户传输对象
     * @return 验证码对象
     */
    UnlockCode register(UserRegisterDto dto);

    /**
     * 向用户发送邮件
     *
     * @param emailAddress 邮箱地址
     * @param text         邮件内容
     */
    void sendEmail2User(String emailAddress, String text);

    /**
     * 检查昵称是否存在
     *
     * @param nickname 所要查找的昵称
     * @return 存在返回true不存在返回false
     */
    boolean checkNickname(String nickname);

    /**
     * 检查邮箱是否存在
     *
     * @param email 所要查找的邮箱
     * @return 存在返回true否则返回false
     */
    boolean checkEmail(String email);

    /**
     * 通过用户登陆用户传输对象登陆
     *
     * @param dto 用户登陆传输对象
     * @return 返回该登陆对象
     */
    ServiceCode<UserLoginCode, User> login(UserLoginDto dto);

    /**
     * 修改密码
     *
     * @param chpwDto 修改密码传输对象
     * @return 修改成功返回true否则返回false
     */
//    boolean changePassword(UserChpwDto chpwDto);

    /**
     * 更改用户普通信息
     *
     * @param simpleDto 包含需要修改信息的传输对象
     * @return 修改成功返回true否则返回false
     */
//    boolean changeSimpleInformation(UserSimpleDto simpleDto);

    /**
     * 检查用户状态
     *
     * @param user 被检查的用户
     * @return 返回用户状态
     */
    String checkUserStatus(User user);

    /**
     * 激活用户
     * 通过比较激活传输对象的Code找到的用户Id和激活传输对象的用户Id做比较
     * 相等返回true否则返回false
     *
     * @param activeDto 激活用户传输对象
     * @return 激活返回码
     */
    ActiveCode activateAccount(UserActiveDto activeDto);

    /**
     * 注销用户
     *
     * @param user 需要被注销的用户
     * @return 注销成功返回true否则返回false
     */
    void deleteUser(User user);
}
