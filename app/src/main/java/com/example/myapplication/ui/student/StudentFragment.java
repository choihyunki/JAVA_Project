package com.example.myapplication.ui.student;

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
import com.example.myapplication.databinding.FragmentStudentBinding;

public class StudentFragment extends Fragment {

    private FragmentStudentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StudentViewModel studentViewModel =
                new ViewModelProvider(this).get(StudentViewModel.class);

        binding = FragmentStudentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textStudent;
        studentViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        NavController navController = Navigation.findNavController(view);

        binding.student1f.setOnClickListener(v -> navController.navigate(R.id.action_nav_student_to_nav_student1f));
        binding.student2f.setOnClickListener(v -> navController.navigate(R.id.action_nav_student_to_nav_student2f));
        binding.student3f.setOnClickListener(v -> navController.navigate(R.id.action_nav_student_to_nav_student3f));
        binding.student4f.setOnClickListener(v -> navController.navigate(R.id.action_nav_student_to_nav_student4f));
        binding.student5f.setOnClickListener(v -> navController.navigate(R.id.action_nav_student_to_nav_student5f));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}