package com.example.aches.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import com.example.aches.R;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
    public void proceed(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(ForgotPassword.this);
        builder.setMessage("Your new password has been sent to your email.");
        builder.setTitle("Password Status!");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
