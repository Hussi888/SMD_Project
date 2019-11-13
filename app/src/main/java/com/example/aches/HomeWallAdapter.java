package com.example.aches;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class HomeWallAdapter extends RecyclerView.Adapter <HomeWallAdapter.SubjectViewHolder>{
    private String[] data;
    public HomeWallAdapter(String[] data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.home_data,parent,false);
        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {
        String value=data[position];
        holder.q_text_value.setText(value);
        holder.a_text_value.setText(value);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class SubjectViewHolder extends RecyclerView.ViewHolder{

        ImageView image_value;
        TextView q_text_value;
        TextView a_text_value;
        public SubjectViewHolder( View itemView) {
            super(itemView);
            image_value=itemView.findViewById(R.id.photo);
            q_text_value=itemView.findViewById(R.id.question);
            a_text_value=itemView.findViewById(R.id.answer);
        }
    }
}
