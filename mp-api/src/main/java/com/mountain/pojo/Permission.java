package com.mountain.pojo;

import lombok.Data;

/**
 * @author ：袁辉
 * @date ：Created in 2021/9/30 3:12
 * @description：权限
 */
@Data
public class Permission {

    private int perId;
    private String perName;
    private Long createTime;
    private Long updateTime;

}
