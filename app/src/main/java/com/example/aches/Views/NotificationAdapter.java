package com.example.aches.Views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aches.R;

public class NotificationAdapter extends RecyclerView.Adapter <NotificationAdapter.NotificationViewHolder> {
        private String[] data;

        public NotificationAdapter(String[] data) {
            this.data = data;
        }

        @NonNull
        @Override
        public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            View view=inflater.inflate(R.layout.notification_list,parent,false);
            return new NotificationViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
            String value=data[position];
            holder.q_text_value.setText(value);
            holder.a_text_value.setText(value);

        }

        @Override
        public int getItemCount() {
            return data.length;
        }

        public class NotificationViewHolder extends RecyclerView.ViewHolder {
            ImageView image_value;
            TextView q_text_value;
            TextView a_text_value;
            public NotificationViewHolder( View itemView) {
                super(itemView);
                image_value=itemView.findViewById(R.id.photo);
                q_text_value=itemView.findViewById(R.id.question);
                a_text_value=itemView.findViewById(R.id.answer);
            }
        }
    }
