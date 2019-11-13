package com.example.aches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void sign_in_page(View view)
    {
        startActivity(new Intent(this,Login.class));
    }

    public void sign_up_page(View view)
    {
        startActivity(new Intent(this,Singup.class));
    }
}
