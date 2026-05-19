package com.example.fruitslistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    ArrayList<FoodModel> arrlist;
    Context context;

    // Constructor
    public FoodAdapter(ArrayList<FoodModel> arrlist, Context context) {
        this.arrlist = arrlist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate item layout (sample_recyclerview.xml)
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind data from FoodModel to views
        FoodModel model = arrlist.get(position);
        holder.imageView.setImageResource(model.getFoodImage());
        holder.textView.setText(model.getFoodName());
    }

    @Override
    public int getItemCount() {
        return arrlist.size();
    }

    // ViewHolder class
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.itemImage);
            textView = itemView.findViewById(R.id.itemText);
        }
    }
}
