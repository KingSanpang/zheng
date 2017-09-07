package com.zheng.common.dto;

import java.io.Serializable;

/**
 * <dl>
 * <dt>UpmsUserInfoRedis</dt>
 * <dd>Description:在redis中缓存登录用户的信息</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2017-9-1</dd>
 * </dl>
 *
 * @author panyk
 */
public class UpmsUserInfoRedis implements Serializable{
    private static final long serialVersionUID = -8076542281757976919L;

    private Integer userId;
    /**
     * 帐号
     */
    private String username;
    /**
     * 姓名
     *
     * @mbg.generated
     */
    private String realname;
    /**
     * 电话
     *
     * @mbg.generated
     */
    private String phone;
    /**
     * 邮箱
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private Byte sex;

    /**
     * 状态(0:正常,1:锁定)
     *
     * @mbg.generated
     */
    private Byte locked;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Long ctime;

    @Override
    public String toString() {
        return "UpmsUserInfoRedis{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", locked=" + locked +
                ", ctime=" + ctime +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
}
