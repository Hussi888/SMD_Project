package com.example.aches.Views;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aches.R;

public class Home extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflator, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
            View rootView= inflator.inflate(R.layout.activity_home,container,false);
            RecyclerView homeView= (RecyclerView) rootView.findViewById(R.id.home_view);
            homeView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
            String [] data={"Sana","Qazi","all","here"};
            homeView.setAdapter(new HomeWallAdapter(data));
            return rootView;
        }
}
