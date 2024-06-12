package com.example.myapplication.ui.student;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class Student2fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student2f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.student2f_1);
        TextView textView2 = view.findViewById(R.id.student2f_2);
        TextView textView3 = view.findViewById(R.id.student2f_3);
        TextView textView4 = view.findViewById(R.id.student2f_4);
        TextView textView5 = view.findViewById(R.id.student2f_5);
        TextView textView6 = view.findViewById(R.id.student2f_6);
        TextView textView7 = view.findViewById(R.id.student2f_7);
        TextView textView8 = view.findViewById(R.id.student2f_8);
        TextView textView9 = view.findViewById(R.id.student2f_9);
        TextView textView10 = view.findViewById(R.id.student2f_10);
        TextView textView11 = view.findViewById(R.id.student2f_11);
        TextView textView12 = view.findViewById(R.id.student2f_12);
        TextView textView13 = view.findViewById(R.id.student2f_13);
        TextView textView14 = view.findViewById(R.id.student2f_14);
        TextView textView15 = view.findViewById(R.id.student2f_15);
        TextView textView16 = view.findViewById(R.id.student2f_16);




        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView8.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView9.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView10.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView11.setOnClickListener(v -> handleTextViewClick(textView11, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView12.setOnClickListener(v -> handleTextViewClick(textView12, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView13.setOnClickListener(v -> handleTextViewClick(textView13, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView14.setOnClickListener(v -> handleTextViewClick(textView14, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView15.setOnClickListener(v -> handleTextViewClick(textView15, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView16.setOnClickListener(v -> handleTextViewClick(textView16, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        // Replace R.drawable.image1 with your actual image



        return view;
    }

    private void handleTextViewClick(TextView textView, int imageResId) {
        if (lastClickedTextView != null && lastClickedTextView == textView) {
            overlayImageView.setVisibility(View.GONE);
            lastClickedTextView = null;
        } else {
            // Set the image resource
            overlayImageView.setImageResource(imageResId);

            // Get the layout parameters of overlayImageView
            ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) overlayImageView.getLayoutParams();

            // Set the margins to move overlayImageView to the desired coordinates
            if (textView.getId() == R.id.student2f_1) {
                params.leftMargin = 100;
                params.topMargin = 380;
            } else if (textView.getId() == R.id.student2f_2) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_3) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_4) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_5) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_6) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_7) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_8) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_9) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_10) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_11) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_12) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_13) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_14) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_15) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }
            else if (textView.getId() == R.id.student2f_16) {
                params.leftMargin = 450;
                params.topMargin = 330;
            }// Add more conditions as needed for other TextViews

            // Apply the modified layout parameters
            overlayImageView.setLayoutParams(params);

            // Make overlayImageView visible
            overlayImageView.setVisibility(View.VISIBLE);

            // Set the last clicked textView
            lastClickedTextView = textView;
        }
    }
}
