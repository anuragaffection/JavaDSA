package com.example.javadsanotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterRecycle extends RecyclerView.Adapter<AdapterRecycle.ViewHolder>{

    Context context;
    ArrayList<model> arrLanguage;
    ItemClickListener itemClickListener;


    AdapterRecycle(Context context, ArrayList<model> arrLanguage, ItemClickListener itemClickListener){
        this.context = context;
        this.arrLanguage = arrLanguage;
        this.itemClickListener = itemClickListener;
    }

    AdapterRecycle(Context context, ArrayList<model> arrLanguage){
        this.context = context;
        this.arrLanguage = arrLanguage;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.language, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int positionAdapter = holder.getAdapterPosition();
        holder.languageImage.setImageResource(arrLanguage.get(positionAdapter).img);
        holder.languageName.setText(arrLanguage.get(positionAdapter).name);
        holder.itemView.setOnClickListener(view ->
                itemClickListener.onItemClick(arrLanguage.get(positionAdapter)));
    }


    @Override
    public int getItemCount() {
        return arrLanguage.size();
    }


    public interface ItemClickListener{
        void onItemClick(model Model);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView languageName;
        ImageView languageImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            languageName = itemView.findViewById(R.id.languageName);
            languageImage = itemView.findViewById(R.id.languageImage);

        }
    }


}
