package com.example.myapplication.ui.junsan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentJunsanBinding;

public class JunsanFragment extends Fragment {

    private FragmentJunsanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JunsanViewModel junsanViewModel =
                new ViewModelProvider(this).get(JunsanViewModel.class);

        binding = FragmentJunsanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textJunsan;
        junsanViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.junsan1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_junsan_to_nav_junsan1f));
        binding.junsan2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_junsan_to_nav_junsan2f));
        binding.junsan3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_junsan_to_nav_junsan3f));
        binding.junsan4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_junsan_to_nav_junsan4f));
        binding.junsan5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_junsan_to_nav_junsan5f));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}