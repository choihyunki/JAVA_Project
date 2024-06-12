package com.example.myapplication.ui.limgok;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.myapplication.R;

import com.example.myapplication.databinding.FragmentLimgokBinding;

public class LimgokFragment extends Fragment {

    private FragmentLimgokBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LimgokViewModel limgokViewModel =
                new ViewModelProvider(this).get(LimgokViewModel.class);

        binding = FragmentLimgokBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLimgok;
        limgokViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        binding.limgok1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_limgok_to_nav_limgok1f));
        binding.limgok2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_limgok_to_nav_limgok2f));
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}