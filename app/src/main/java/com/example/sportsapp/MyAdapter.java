package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.SportViewHolder>{

    private List<Sport> sportList;

    public MyAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_layout,parent,false);


        return new SportViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.sportName.setText(sport.sportName);
        holder.sportImg.setImageResource(sport.sportImg);
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


    public static class SportViewHolder extends RecyclerView.ViewHolder{
        TextView sportName;
        ImageView sportImg;
        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            sportName = itemView.findViewById(R.id.textView);
            sportImg= itemView.findViewById(R.id.imageView);
        }
    }
}
