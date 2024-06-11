package com.example.myapplication.ui.toegye;

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

public class Toegye5fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_toegye5f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.toegye5f_1);
        TextView textView2 = view.findViewById(R.id.toegye5f_2);
        TextView textView3 = view.findViewById(R.id.toegye5f_3);
        TextView textView4 = view.findViewById(R.id.toegye5f_4);
        TextView textView5 = view.findViewById(R.id.toegye5f_5);
        TextView textView6 = view.findViewById(R.id.toegye5f_6);
        TextView textView7 = view.findViewById(R.id.toegye5f_7);
        TextView textView8 = view.findViewById(R.id.toegye5f_8);
        TextView textView9 = view.findViewById(R.id.toegye5f_9);
        TextView textView10 = view.findViewById(R.id.toegye5f_10);
        TextView textView11 = view.findViewById(R.id.toegye5f_11);
        TextView textView12 = view.findViewById(R.id.toegye5f_12);

        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView8.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView9.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView10.setOnClickListener(v -> handleTextViewClick(textView10, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView11.setOnClickListener(v -> handleTextViewClick(textView11, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView12.setOnClickListener(v -> handleTextViewClick(textView12, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image


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
            if (textView.getId() == R.id.toegye5f_1) {
                params.leftMargin = 150;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.toegye5f_2) {
                params.leftMargin = 260;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.toegye5f_3) {
                params.leftMargin = 350;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.toegye5f_4) {
                params.leftMargin = 440;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.toegye5f_5) {
                params.leftMargin = 730;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.toegye5f_6) {
                params.leftMargin = 870;
                params.topMargin = 540;
            } else if (textView.getId() == R.id.toegye5f_7) {
                params.leftMargin = 760;
                params.topMargin = 540;
            } else if (textView.getId() == R.id.toegye5f_8) {
                params.leftMargin = 660;
                params.topMargin = 540;
            } else if (textView.getId() == R.id.toegye5f_9) {
                params.leftMargin = 540;
                params.topMargin = 540;
            } else if (textView.getId() == R.id.toegye5f_10) {
                params.leftMargin = 400;
                params.topMargin = 540;
            } else if (textView.getId() == R.id.toegye5f_11) {
                params.leftMargin = 290;
                params.topMargin = 540;
            } else if (textView.getId() == R.id.toegye5f_12) {
                params.leftMargin = 180;
                params.topMargin = 540;
            }


            // Add more conditions as needed for other TextViews

            // Apply the modified layout parameters
            overlayImageView.setLayoutParams(params);

            // Make overlayImageView visible
            overlayImageView.setVisibility(View.VISIBLE);

            // Set the last clicked textView
            lastClickedTextView = textView;
        }
    }
}
