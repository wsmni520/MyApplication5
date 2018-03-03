package com.example.mrzhang.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mrzhang.myapplication.Bean.UserBean;
import com.example.mrzhang.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;
    private UserBean mUserBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //通过DataBInding加载布局都会对应的生成一个对象，如ActivityMainBinding，对象名在布局文件名称后加上了一个后缀Binding
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //实例化UserBean
        mUserBean = new UserBean("张三", 25);
        mActivityMainBinding.setUser(mUserBean);

    }
}
