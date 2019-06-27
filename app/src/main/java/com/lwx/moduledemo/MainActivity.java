package com.lwx.moduledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lwx.common_lib.utils.RouterPath;

public class MainActivity extends AppCompatActivity {
    private Button mBtnNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnNews = (Button) findViewById(R.id.btn_news);

        mBtnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouterPath.ROUTER_NEWS).navigation();
            }
        });
    }
}
