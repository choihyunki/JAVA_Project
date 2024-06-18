package com.example.myapplication.ui.yulgok;

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

public class Yulgok1fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yulgok1f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.yulgok1f_1);
        TextView textView2 = view.findViewById(R.id.yulgok1f_2);
        TextView textView3 = view.findViewById(R.id.yulgok1f_3);
        TextView textView4 = view.findViewById(R.id.yulgok1f_4);
        TextView textView5 = view.findViewById(R.id.yulgok1f_5);
        TextView textView6 = view.findViewById(R.id.yulgok1f_6);
        TextView textView7 = view.findViewById(R.id.yulgok1f_7);

        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image




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
            if (textView.getId() == R.id.yulgok1f_1) {
                params.leftMargin = 850;
                params.topMargin = 200;
            } else if (textView.getId() == R.id.yulgok1f_2) {
                params.leftMargin = 770;
                params.topMargin = 200;
            } else if (textView.getId() == R.id.yulgok1f_3) {
                params.leftMargin = 770;
                params.topMargin = 400;
            } else if (textView.getId() == R.id.yulgok1f_4) {
                params.leftMargin = 710;
                params.topMargin = 400;
            } else if (textView.getId() == R.id.yulgok1f_5) {
                params.leftMargin = 650;
                params.topMargin = 400;
            } else if (textView.getId() == R.id.yulgok1f_6) {
                params.leftMargin = 590;
                params.topMargin = 400;
            } else if (textView.getId() == R.id.yulgok1f_7) {
                params.leftMargin = 300;
                params.topMargin = 400;
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
