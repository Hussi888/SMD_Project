package com.example.aches;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class HomeWallAdapter extends RecyclerView.Adapter <HomeWallAdapter.HomeViewHolder>{
    private String[] data;
    public HomeWallAdapter(String[] data)
    {
        this.data=data;
    }
    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.home_data,parent,false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        String value = data[position];
        //  holder.q_text_value.setText(value);
        // holder.a_text_value.setText(value);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{


        ImageView image_value;

        //   TextView q_text_value;
        //  TextView a_text_value;
        public HomeViewHolder(View itemView) {
            super(itemView);
            image_value = itemView.findViewById(R.id.photo);
            //  q_text_value=itemView.findViewById(R.id.question);
            // a_text_value=itemView.findViewById(R.id.answer);

    }
    }
}
