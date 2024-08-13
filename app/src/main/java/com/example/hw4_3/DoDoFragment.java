package com.example.hw4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4_3.databinding.FragmentDoDoBinding;

import java.util.ArrayList;


public class DoDoFragment extends Fragment implements OnItemClick {
    FragmentDoDoBinding binding;
    private ArrayList<DoDo> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDoDoBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
        DoDoAdapter doDoAdapter = new DoDoAdapter(list,this);
        binding.rvCar.setAdapter(doDoAdapter);

    }

    private void initAdapter() {
        list.add(new DoDo("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "pizza"));
        list.add(new DoDo("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "juice"));
        list.add(new DoDo("https://png.pngtree.com/png-clipart/20230412/original/pngtree-modern-kitchen-food-boxed-cheese-lunch-pizza-png-image_9048155.png", "desert"));

    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putString("keyForPosition", String.valueOf(position));
        DetailFragment countryFragment = new DetailFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();

    }
}