package com.example.mrzhang.myapplication.Bean;

/**
 * Created by Mr.Zhang on 2018/3/3.
 */

public class UserBean {
    private String mName;
    private int mAge;

    public UserBean(String name, int age) {
        this.mName = name;
        this.mAge = age;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String name) {
        this.mName = name;
    }

    public int getMAge() {
        return mAge;
    }

    public void setMAge(int age) {
        this.mAge = age;
    }
}
