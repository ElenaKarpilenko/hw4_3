package com.example.hw4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4_3.databinding.FragmentDetailBinding;

import java.util.ArrayList;

public class DetailFragment extends Fragment {

    FragmentDetailBinding binding;
    private Integer position;
    public ArrayList<DetailModel> countryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DetailAdapter adapter = new DetailAdapter(countryList);
        position = getArguments().getInt("keyForPosition", 0);
        binding.rvDetail.setAdapter(adapter);
        positionCountry(position);
    }

    private void positionCountry(int position) {
        switch (position) {
            case 0:
                Pizza();
                break;
            case 1:
                juice();
                break;
            case 2:
                dessert();
                break;
        }
    }


    private void Pizza() {
        countryList.add(new DetailModel("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        countryList.add(new DetailModel("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        countryList.add(new DetailModel("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        countryList.add(new DetailModel("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        countryList.add(new DetailModel("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        countryList.add(new DetailModel("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
    }

    private void juice() {
        countryList.add(new DetailModel("https://png.pngtree.com/element_our/20190530/ourlarge/pngtree-a-glass-bottle-of-drink-image_1261624.jpg", "cola"));
        countryList.add(new DetailModel("https://png.pngtree.com/element_our/20190530/ourlarge/pngtree-a-glass-bottle-of-drink-image_1261624.jpg", "cola"));
        countryList.add(new DetailModel("https://png.pngtree.com/element_our/20190530/ourlarge/pngtree-a-glass-bottle-of-drink-image_1261624.jpg", "cola"));
        countryList.add(new DetailModel("https://png.pngtree.com/element_our/20190530/ourlarge/pngtree-a-glass-bottle-of-drink-image_1261624.jpg", "cola"));
        countryList.add(new DetailModel("https://png.pngtree.com/element_our/20190530/ourlarge/pngtree-a-glass-bottle-of-drink-image_1261624.jpg", "cola"));
    }

    private void dessert() {
        countryList.add(new DetailModel("https://static.vecteezy.com/system/resources/thumbnails/016/391/478/small_2x/brownie-cake-dessert-box-food-theme-decoration-png.png", "sdfghjkl"));
        countryList.add(new DetailModel("https://static.vecteezy.com/system/resources/thumbnails/016/391/478/small_2x/brownie-cake-dessert-box-food-theme-decoration-png.png", "sdfghjkl"));
        countryList.add(new DetailModel("https://static.vecteezy.com/system/resources/thumbnails/016/391/478/small_2x/brownie-cake-dessert-box-food-theme-decoration-png.png", "sdfghjkl"));
        countryList.add(new DetailModel("https://static.vecteezy.com/system/resources/thumbnails/016/391/478/small_2x/brownie-cake-dessert-box-food-theme-decoration-png.png", "sdfghjkl"));
        countryList.add(new DetailModel("https://static.vecteezy.com/system/resources/thumbnails/016/391/478/small_2x/brownie-cake-dessert-box-food-theme-decoration-png.png", "sdfghjkl"));

    }
}