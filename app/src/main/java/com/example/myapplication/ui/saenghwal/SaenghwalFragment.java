package com.example.myapplication.ui.saenghwal;

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
import com.example.myapplication.databinding.FragmentSaenghwalBinding;

public class SaenghwalFragment extends Fragment {

    private FragmentSaenghwalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SaenghwalViewModel saenghwalViewModel =
                new ViewModelProvider(this).get(SaenghwalViewModel.class);

        binding = FragmentSaenghwalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSaenghwal;
        saenghwalViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        binding.saenghwal1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_saenghwal_to_nav_saenghwal1f));
        binding.saenghwal2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_saenghwal_to_nav_saenghwal2f));
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}