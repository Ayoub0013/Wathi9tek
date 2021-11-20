package com.example.wathi9tek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class documentsAdapter extends RecyclerView.Adapter<documentsAdapter.ViewHolder> {
    String data[];
    Context context;
    public documentsAdapter(String[] data, Context context){
        this.data=data;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.document,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.documentName.setText(data[position]);
        holder.documentName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked on "+data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {

        return data.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView documentName ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            documentName = itemView.findViewById(R.id.document);
        }
    }
}

