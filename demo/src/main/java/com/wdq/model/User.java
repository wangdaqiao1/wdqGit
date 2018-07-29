package com.wdq.model;

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: com.wdq.model.User
 * Author:   kinbridge
 * Date:     2018/7/29 17:23
 * Description: com.wdq.model
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class User {
    private int id;
    private String userName;
    private String age;

    @Override
    public String toString() {
        return "User [id=" + id + ", age=" + age + ", userName=" + userName
                + "]";
    }
    public User(){
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public User(int id, String age, String userName) {
        super();
        this.id = id;
        this.age = age;
        this.userName = userName;
    }
}
