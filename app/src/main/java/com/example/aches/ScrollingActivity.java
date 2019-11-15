package com.example.aches;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

public class ScrollingActivity  extends Fragment {

TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflator, @Nullable ViewGroup container, @Nullable Bundle savdInstanceState)
    {
        View rootView= inflator.inflate(R.layout.activity_scrolling,container,false);
        tabLayout = rootView.findViewById(R.id.tabs);
        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = toolbar.findViewById(R.id.toolbar_layout);
        setupTabIcons();
        return rootView;
    }

    private void setupTabIcons() {
        final int[] tabIcons = {
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_search_black_24dp,
                R.drawable.ic_home_black_24dp};




    }
}

