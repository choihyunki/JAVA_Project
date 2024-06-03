package com.example.myapplication.ui.center;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentCenterBinding;

public class CenterFragment extends Fragment {

    private FragmentCenterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CenterViewModel centerViewModel =
                new ViewModelProvider(this).get(CenterViewModel.class);

        binding = FragmentCenterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCenter;
        centerViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}