package com.example.myapplication.ui.dasan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentDasanBinding;

public class DasanFragment extends Fragment {

    private FragmentDasanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DasanViewModel dasanViewModel =
                new ViewModelProvider(this).get(DasanViewModel.class);

        binding = FragmentDasanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDasan;
        dasanViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}