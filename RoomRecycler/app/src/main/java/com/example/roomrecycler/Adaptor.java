package com.example.roomrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptor extends RecyclerView.Adapter<Adaptor.ViewHolder> {
    @NonNull
    public String retrievedData[];
    public Adaptor(String[] retrievedData)

    {
        this.retrievedData=retrievedData;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.retrieve_resource_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        String data=retrievedData[position];
        holder.retrievedDataText.setText(data);
    }

    @Override
    public int getItemCount() {
        return retrievedData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView retrievedDataText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            retrievedDataText=itemView.findViewById(R.id.retrieved_data);
        }
    }
}