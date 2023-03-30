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


public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>{

    Context context;
    ArrayList<model> arrLanguage;

    /*
      comment int lastPosition = -1;
      RecyclerView recyclerLanguage;
    */


    RecycleAdapter(Context context, ArrayList<model> arrLanguage){
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
    }


    @Override
    public int getItemCount() {
        return arrLanguage.size();
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
