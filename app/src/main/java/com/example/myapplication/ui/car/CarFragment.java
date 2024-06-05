package com.example.myapplication.ui.car;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentCarBinding;

public class CarFragment extends Fragment {

    private FragmentCarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       CarViewModel carViewModel =
                new ViewModelProvider(this).get(CarViewModel.class);

        binding = FragmentCarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCar;
        carViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageButton imageButton1f = binding.car1f;
        ImageButton imageButton3f = binding.car3f;
        ImageButton imageButton4f = binding.car4f;
        ImageButton imageButton5f = binding.car5f;
        ImageButton imageButton6f = binding.car6f;
        ImageButton imageButton7f = binding.car7f;

        imageButton1f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Car1fFragment.class);
                startActivity(intent);
            }
        });

        imageButton3f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Car3fFragment.class);
                startActivity(intent);
            }
        });
        imageButton4f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Car4fFragment.class);
                startActivity(intent);
            }
        });
        imageButton5f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Car5fFragment.class);
                startActivity(intent);
            }
        });
        imageButton6f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Car6fFragment.class);
                startActivity(intent);
            }
        });
        imageButton7f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Car7fFragment.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}