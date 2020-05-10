package com.ly.spring.entity;

import java.io.Serializable;

public class User implements Serializable {


    public User(){}

    public User(String userName, String passWord, Integer sex){
        this.userName = userName;
        this. passWord = passWord;
        this.userSex =sex;
    }


    private Long id;

    private String userName;

    private String passWord;

    private Integer userSex;

    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
