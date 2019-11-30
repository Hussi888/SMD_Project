package com.example.aches.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aches.R;

public class Profile extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflator, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView= inflator.inflate(R.layout.activity_profile,container,false);
        return rootView;
    }

}

