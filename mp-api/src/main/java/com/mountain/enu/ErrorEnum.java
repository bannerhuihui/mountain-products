package com.mountain.enu;

/**
 * @author ：袁辉
 * @date ：Created in 2021/9/30 3:14
 * @description：错误集
 */
public enum ErrorEnum {
    ERROR_LOGIN(20001,"登录失败")
    ;

    private int errorId;
    private String errorName;

    ErrorEnum(int errorId,String errorName){
        this.errorId = errorId;
        this.errorName = errorName;
    }


    public int getErrorId() {
        return errorId;
    }

    public String getErrorName() {
        return errorName;
    }

}
