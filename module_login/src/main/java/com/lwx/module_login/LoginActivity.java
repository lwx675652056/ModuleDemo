package com.lwx.module_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lwx.common_lib.utils.RouterPath;

@Route(path = RouterPath.ROUTER_LOGIN)
public class LoginActivity extends AppCompatActivity {
    private EditText edtPhone;
    private EditText edtPwd;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtPhone = (EditText) findViewById(R.id.edt_phone);
        edtPwd = (EditText) findViewById(R.id.edt_pwd);
        btnLogin = (Button) findViewById(R.id.btn_login);

        String phone = getIntent().getStringExtra("phone");
        String pwd = getIntent().getStringExtra("pwd");
        edtPhone.setText(phone);
        edtPwd.setText(pwd);
    }
}
