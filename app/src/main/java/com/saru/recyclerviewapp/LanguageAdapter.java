package com.saru.recyclerviewapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.ViewHolder> {

    Context context;
    List<LanguageModel> list;

    public LanguageAdapter(Context context, List<LanguageModel> list) {
        this.context = context;
        this.list = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name, desc;

        public ViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.imgLogo);
            name = view.findViewById(R.id.tvName);
            desc = view.findViewById(R.id.tvDesc);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_language, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        LanguageModel model = list.get(position);

        holder.name.setText(model.name);
        holder.desc.setText(model.desc);
        holder.img.setImageResource(model.image);

        holder.itemView.setOnClickListener(view -> {

            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", model.name);
            intent.putExtra("desc", model.desc);
            intent.putExtra("image", model.image);

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}