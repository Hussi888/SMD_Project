package com.example.aches.Views;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aches.R;

public class CategoryAdapter extends RecyclerView.Adapter <CategoryAdapter.CategoryViewHolder>{
        private String[] data;
        public CategoryAdapter(String[] data)
        {
            this.data=data;
        }
        @NonNull
        @Override
        public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            View view=inflater.inflate(R.layout.category_list,parent,false);
            return new CategoryViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
            String value=data[position];
            holder.q_text_value.setText(value);
        }

        @Override
        public int getItemCount() {
            return data.length;
        }
        public class CategoryViewHolder extends RecyclerView.ViewHolder{

            ImageView image_value;
            TextView q_text_value;
            public CategoryViewHolder( View itemView) {
                super(itemView);
                image_value=itemView.findViewById(R.id.photo);
                q_text_value=itemView.findViewById(R.id.question);
            }
        }
    }

