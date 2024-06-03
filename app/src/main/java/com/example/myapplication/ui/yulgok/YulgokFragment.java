package com.example.myapplication.ui.yulgok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentYulgokBinding;

public class YulgokFragment extends Fragment {

    private FragmentYulgokBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        YulgokViewModel yulgokViewModel =
                new ViewModelProvider(this).get(YulgokViewModel.class);

        binding = FragmentYulgokBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textYulgok;
        yulgokViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}