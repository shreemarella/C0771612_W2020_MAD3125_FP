package com.shreemarella.c0771612_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class LoginActivity extends AppCompatActivity
{
    private EditText edtEmail;
    private EditText edtPassword;
    private Switch swtRemember;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtEmail=findViewById(R.id.edtEmail);
        edtPassword=findViewById(R.id.edtPassword);
        swtRemember=findViewById(R.id.swtRemember);
        btnLogin=findViewById(R.id.btnLogin);

    }
}
