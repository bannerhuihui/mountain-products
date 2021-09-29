package com.mountain.pojo;

import lombok.Data;

/**
 * @author ：袁辉
 * @date ：Created in 2021/9/30 2:51
 * @description：用户表
 */
@Data
public class User {

    private String userId; //用户ID
    private String nickName; // 用户昵称
    private Long createTime; // 创建时间
    private Long updateTime; // 最后更新时间
    private int state; // 用户状态
    private String loginName; // 登录用户名
    private String passWord; // 登录密码
    private String salt; // 盐
    private int auth; // 是否认证
    private String phone; //绑定手机号
}
