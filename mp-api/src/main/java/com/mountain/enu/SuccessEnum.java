package com.mountain.enu;

/**
 * @author ：袁辉
 * @date ：Created in 2021/9/30 3:25
 * @description：成功集
 */
public enum  SuccessEnum {
    SUCCESS_LOGIN(10001,"登录成功")
    ;
    private int successId;
    private String successName;

    SuccessEnum (int successId,String successName){
        this.successId = successId;
        this.successName = successName;
    }

    public int getSuccessId() {
        return successId;
    }

    public String getSuccessName() {
        return successName;
    }
}
