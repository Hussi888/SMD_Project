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
/*
public class category extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        RecyclerView categories=findViewById(R.id.category_view);
        categories.setLayoutManager(new LinearLayoutManager(this));
        String [] data={"Tech-Aches","Code-Aches","Health-Aches","Beauty-Aches","Food-Aches","Study-Aches","Fashion-Aches","Relationship-Aches","Game-Aches","Vehicle-Aches","Pet-Aches","Plant-Aches","Job-Aches","Parent-Aches","Creative-Aches","Language-Aches","Music-Aches"};
        categories.setAdapter(new CategoryAdapter(data));
    }
}
*/

public class category extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflator, @Nullable ViewGroup container, @Nullable Bundle savdInstanceState)
    {


        View rootView= inflator.inflate(R.layout.activity_category,container,false);
        RecyclerView categories=rootView.findViewById(R.id.category_view);
        categories.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        String [] data={"Tech-Aches","Code-Aches","Health-Aches","Beauty-Aches","Food-Aches","Study-Aches","Fashion-Aches","Relationship-Aches","Game-Aches","Vehicle-Aches","Pet-Aches","Plant-Aches","Job-Aches","Parent-Aches","Creative-Aches","Language-Aches","Music-Aches"};
        categories.setAdapter(new CategoryAdapter(data));

        return rootView;
    }

}