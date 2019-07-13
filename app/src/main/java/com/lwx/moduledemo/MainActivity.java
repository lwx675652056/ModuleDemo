package com.lwx.moduledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lwx.common_lib.utils.RouterPath;

public class MainActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private Button mBtnNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mBtnNews = (Button) findViewById(R.id.btn_news);


        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(RouterPath.ROUTER_LOGIN)
                        .withString("phone","18212341234").withString("pwd","123456").navigation();
            }
        });

        mBtnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouterPath.ROUTER_NEWS).navigation();
            }
        });
    }
}
