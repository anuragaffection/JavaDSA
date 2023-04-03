package com.example.javadsanotes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterChapter extends RecyclerView.Adapter<AdapterChapter.ViewHolder> {

    Context context;
    ArrayList<model> arrChapter;

    AdapterChapter(Context context, ArrayList<model> arrChapter){
        this.context = context;
        this.arrChapter = arrChapter;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.topics, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull AdapterChapter.ViewHolder holder, int position) {

        int positionAdapter = holder.getAdapterPosition();

        holder.topicsName.setText(arrChapter.get(positionAdapter).chapter);
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ActPDF.class);
            intent.putExtra("position", positionAdapter);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return arrChapter.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView topicsName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            topicsName = itemView.findViewById(R.id.topicsName);
        }
    }

}
