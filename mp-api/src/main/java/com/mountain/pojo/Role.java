package com.mountain.pojo;

import lombok.Data;

/**
 * @author ：袁辉
 * @date ：Created in 2021/9/30 3:10
 * @description：角色
 */
@Data
public class Role {

    private int roleId;
    private String roleName;
    private Long createTime;
    private Long updateTime;
}
