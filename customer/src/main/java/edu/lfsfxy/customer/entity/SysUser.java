package edu.lfsfxy.customer.entity;

public class SysUser {
    private int  userId;
    private String userCode;
    private String userName;
    private String userPassword;
    private int userState;

    public SysUser() {
    }

    public SysUser(int userId, String userCode, String userName, String userPassword, int userState) {
        this.userId = userId;
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userState = userState;
    }

    @Override
    public String toString() {
        return "SysUser{" + "userId=" + userId + ", userCode='" + userCode + '\'' + ", userName='" + userName + '\'' + ", userPassword='" + userPassword + '\'' + ", userState=" + userState + '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }
}

