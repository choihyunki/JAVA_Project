package com.example.myapplication.ui.toegye;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentToegyeBinding;

public class ToegyeFragment extends Fragment {

    private FragmentToegyeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ToegyeViewModel toegyeViewModel =
                new ViewModelProvider(this).get(ToegyeViewModel.class);

        binding = FragmentToegyeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textToegye;
        toegyeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}