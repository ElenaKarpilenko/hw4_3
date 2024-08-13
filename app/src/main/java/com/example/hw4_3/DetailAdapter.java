package com.example.hw4_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw4_3.databinding.DodoItemBinding;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailViewHolder> {
    public ArrayList<DetailModel> countryList;

    public DetailAdapter(ArrayList<DetailModel> countryList) {
        this.countryList = countryList;
    }



    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DetailViewHolder(DodoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        holder.onBind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

class DetailViewHolder extends RecyclerView.ViewHolder {
    public DodoItemBinding binding;

    public DetailViewHolder(@NonNull DodoItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(DetailModel country) {
        binding.tvName.setText(country.getName());
        Glide.with(binding.imgCar).load(country.getImage()).into(binding.imgCar);
    }
}
