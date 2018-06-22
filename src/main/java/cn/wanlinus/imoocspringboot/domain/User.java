package cn.wanlinus.imoocspringboot.domain;


import cn.wanlinus.imoocspringboot.enums.UserStatusCode;
import cn.wanlinus.imoocspringboot.enums.UserGender;
import cn.wanlinus.imoocspringboot.util.CommonTool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 *
 * @author wanli
 */

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    private String id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_nickname")
    private String nickname;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_position")
    private String position;

    @Column(name = "user_experience")
    private Integer experience;

    @Column(name = "user_address")
    private String address;

    @Column(name = "user_learn_time")
    private Integer learnTime;

    @Column(name = "user_integral")
    private Integer integral;

    @Column(name = "user_signature")
    private String signature;

    @Column(name = "user_avatar")
    private String avatar;

    @Column(name = "user_gender")
    private UserGender gender;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_balance")
    private Double balance;

    @Column(name = "user_register_time")
    private Date registerTime;

    @Column(name = "user_status")
    private UserStatusCode status;

    @Column(name = "user_birthday")
    private Date birthday;

    @Column(name = "user_telephone")
    private String telephone;

    public User() {
    }

    /**
     * 使用构建设计模式模式
     *
     * @param builder 构建起
     */
    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.email = builder.email;
        this.position = builder.position;
        this.experience = builder.experience;
        this.address = builder.address;
        this.learnTime = builder.learnTime;
        this.integral = builder.integral;
        this.signature = builder.signature;
        this.avatar = builder.avatar;
        this.gender = builder.gender;
        this.balance = builder.balance;
        this.registerTime = builder.registerTime;
        this.status = builder.status;
        this.birthday = builder.birthday;
        this.telephone = builder.telephone;
    }

    public static class Builder {
        private String nickname;
        private String password;
        private String email;

        public Builder(String nickname, String password, String email) {
            this.nickname = nickname;
            this.password = password;
            this.email = email;
        }

        private String id = CommonTool.getUUID();
        private String name = "";
        private String position = "";
        private Integer experience = 0;
        private String address = "";
        private Integer learnTime = 0;
        private Integer integral = 0;
        private String signature = "";
        private String avatar = "";
        private UserGender gender = UserGender.UNKNOWN;
        private Double balance = 0.0;
        private Date registerTime = new Date();
        private UserStatusCode status = UserStatusCode.INACTIVE;
        private Date birthday = new Date();
        private String telephone = "";

        public Builder id(String val) {
            this.id = id;
            return this;
        }

        public Builder name(String val) {
            this.name = val;
            return this;
        }

        public Builder position(String val) {
            this.position = val;
            return this;
        }

        public Builder experience(Integer val) {
            this.experience = val;
            return this;
        }

        public Builder address(String val) {
            this.address = val;
            return this;
        }

        public Builder learnTime(Integer val) {
            this.learnTime = val;
            return this;
        }

        public Builder integral(Integer val) {
            this.integral = val;
            return this;
        }

        public Builder signature(String val) {
            this.signature = val;
            return this;
        }

        public Builder avatar(String val) {
            this.avatar = val;
            return this;
        }

        public Builder gender(UserGender val) {
            this.gender = val;
            return this;
        }

        public Builder balance(Double val) {
            this.balance = val;
            return this;
        }

        public Builder registerTime(Date val) {
            this.registerTime = val;
            return this;
        }

        public Builder status(UserStatusCode val) {
            this.status = val;
            return this;
        }

        public Builder birthday(Date val) {
            this.birthday = val;
            return this;
        }

        public Builder telephone(String val) {
            this.telephone = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLearnTime() {
        return learnTime;
    }

    public void setLearnTime(Integer learnTime) {
        this.learnTime = learnTime;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public UserGender getGender() {
        return gender;
    }

    public void setGender(UserGender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public UserStatusCode getStatus() {
        return status;
    }

    public void setStatus(UserStatusCode status) {
        this.status = status;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
