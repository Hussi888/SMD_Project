package com.example.aches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void sign_up_page(View view)
    {
        startActivity(new Intent(this,Singup.class));
    }
    public void forgot_password_page(View view)
    {
        startActivity(new Intent(this,ForgotPassword.class));
    }
}
