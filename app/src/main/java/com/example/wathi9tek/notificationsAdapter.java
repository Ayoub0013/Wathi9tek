package com.example.wathi9tek;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class notificationsAdapter extends RecyclerView.Adapter<notificationsAdapter.ViewHolder> {
    private ArrayList<String> title;
    private ArrayList<String> content;
    private ArrayList<String> time;
    public notificationsAdapter(ArrayList<String> title, ArrayList<String> content, ArrayList<String> time){
        this.title = title;
        this.content = content;
        this.time = time;
    }
    @NonNull
    @Override
    public notificationsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.notification,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull notificationsAdapter.ViewHolder holder, int position) {
        String titla = title.get(position);
        String contenta = content.get(position);
        String tima = time.get(position);
        holder.title.setText(titla);
        holder.content.setText(contenta);
        holder.time.setText(tima);
    }

    @Override
    public int getItemCount() {
        return title.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, content,time;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            content = itemView.findViewById(R.id.content);
            time = itemView.findViewById(R.id.time);        }
    }
}

