package com.example.myapplication.ui.car;

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
public class Car6fFragment extends Fragment {
    private ImageView overlayImageView;
    private TextView lastClickedTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car6f, container, false);

        overlayImageView = view.findViewById(R.id.overlay_image);

        TextView textView1 = view.findViewById(R.id.car6f_1);
        TextView textView2 = view.findViewById(R.id.car6f_2);
        TextView textView3 = view.findViewById(R.id.car6f_3);
        TextView textView4 = view.findViewById(R.id.car6f_4);
        TextView textView5 = view.findViewById(R.id.car6f_5);
        TextView textView6 = view.findViewById(R.id.car6f_6);
        TextView textView7 = view.findViewById(R.id.car6f_7);
        TextView textView8 = view.findViewById(R.id.car6f_8);
        TextView textView9 = view.findViewById(R.id.car6f_9);


        textView1.setOnClickListener(v -> handleTextViewClick(textView1, R.drawable.ic_maker)); // Replace R.drawable.image1 with your actual image
        textView2.setOnClickListener(v -> handleTextViewClick(textView2, R.drawable.ic_maker)); // Replace R.drawable.image2 with your actual image
        textView3.setOnClickListener(v -> handleTextViewClick(textView3, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView4.setOnClickListener(v -> handleTextViewClick(textView4, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView5.setOnClickListener(v -> handleTextViewClick(textView5, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView6.setOnClickListener(v -> handleTextViewClick(textView6, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView7.setOnClickListener(v -> handleTextViewClick(textView7, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView8.setOnClickListener(v -> handleTextViewClick(textView8, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image
        textView9.setOnClickListener(v -> handleTextViewClick(textView9, R.drawable.ic_maker)); // Replace R.drawable.image3 with your actual image


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
            if (textView.getId() == R.id.car6f_1) {
                params.leftMargin = 350;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.car6f_2) {
                params.leftMargin = 450;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.car6f_3) {
                params.leftMargin = 550;
                params.topMargin = 220;
            } else if (textView.getId() == R.id.car6f_4) {
                params.leftMargin = 900;
                params.topMargin = 520;
            } else if (textView.getId() == R.id.car6f_5) {
                params.leftMargin = 750;
                params.topMargin = 520;
            } else if (textView.getId() == R.id.car6f_6) {
                params.leftMargin = 620;
                params.topMargin = 520;
            } else if (textView.getId() == R.id.car6f_7) {
                params.leftMargin = 520;
                params.topMargin = 520;
            }else if (textView.getId() == R.id.car6f_8) {
                params.leftMargin = 400;
                params.topMargin = 520;
            }else if (textView.getId() == R.id.car6f_9) {
                params.leftMargin = 250;
                params.topMargin = 520;
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
