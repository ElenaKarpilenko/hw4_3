package com.example.hw4_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.bumptech.glide.Glide;
import com.example.hw4_3.databinding.DodoItemBinding;

public class DoDoAdapter extends RecyclerView.Adapter<DoDoViewHolder> {

    private ArrayList<DoDo> doDoArrayListList;
    OnItemClick onItemClick;

    public DoDoAdapter(ArrayList<DoDo> doDoArrayListList, OnItemClick onItemClick) {
        this.doDoArrayListList = doDoArrayListList !=null? doDoArrayListList : new ArrayList<>();
        this.onItemClick = onItemClick;
    }


    @NonNull
    @Override
    public DoDoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DoDoViewHolder(DodoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DoDoViewHolder holder, int position) {
        holder.onBind(doDoArrayListList.get(position));
        holder.itemView.setOnClickListener(view ->
                onItemClick.onClick(position));
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

class DoDoViewHolder extends RecyclerView.ViewHolder {
    DodoItemBinding binding;

    public DoDoViewHolder(DodoItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(DoDo doDo) {
        binding.tvName.setText(doDo.getName());
        Glide.with(binding.imgCar).load(doDo.getImage()).into(binding.imgCar);
    }
}


