package com.example.javadsanotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.ViewHolder> {

    Context context;
    ArrayList<model> arrChapter;

    ChapterAdapter(Context context, ArrayList<model> arrChapter){
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
    public void onBindViewHolder(@NonNull ChapterAdapter.ViewHolder holder, int position) {

        int positionAdapter = holder.getAdapterPosition();
        holder.topicsName.setText(arrChapter.get(positionAdapter).chapter);
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
