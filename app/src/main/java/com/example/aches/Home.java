package com.example.aches;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
      //startActivity(new Intent(this,Login.class));
                RecyclerView home_wall_data=findViewById(R.id.home_view);
                home_wall_data.setLayoutManager(new LinearLayoutManager(this));
                String [] data={"Past Papers","Books","Others"};
                home_wall_data.setAdapter(new HomeWallAdapter(data));
            }
    public void sign_in_page(View view)
    {
        startActivity(new Intent(this,Login.class));
    }
}
