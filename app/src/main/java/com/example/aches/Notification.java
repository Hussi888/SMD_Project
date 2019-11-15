package com.example.aches;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Notification  extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflator, @Nullable ViewGroup container, @Nullable Bundle savdInstanceState) {
        View rootView = inflator.inflate(R.layout.activity_notification, container, false);
        RecyclerView notificationView = (RecyclerView) rootView.findViewById(R.id.notification_view);
        notificationView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        String[] data = {"Sana", "Qazi", "all", "here", "kon", "SMD", "sasa", "sasa", "dahsjahs", "saisjakjskajskajskajskaksjkajskajskajksjaksj"};
        notificationView.setAdapter(new NotificationAdapter(data));
        return rootView;

    }
}
