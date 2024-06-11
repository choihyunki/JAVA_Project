package com.example.myapplication.ui.car;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
public class Car4fFragment extends Fragment {
    private CarImageView carImageView;
    private TextView lastClickedTextView;

    private final float[][] startCoordinates = {
            {350, 560},
            {120, 450}
    };


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car4f, container, false);

        carImageView = view.findViewById(R.id.carimage_4f);

        TextView textView1 = view.findViewById(R.id.car4f_1);
        TextView textView2 = view.findViewById(R.id.car4f_2);
        TextView textView3 = view.findViewById(R.id.car4f_3);
        TextView textView4 = view.findViewById(R.id.car4f_4);
        TextView textView5 = view.findViewById(R.id.car4f_5);
        TextView textView6 = view.findViewById(R.id.car4f_6);
        TextView textView7 = view.findViewById(R.id.car4f_7);
        TextView textView8 = view.findViewById(R.id.car4f_8);
        TextView textView9 = view.findViewById(R.id.car4f_9);
        TextView textView10 = view.findViewById(R.id.car4f_10);
        TextView textView11 = view.findViewById(R.id.car4f_11);

        textView1.setOnClickListener(v -> handleTextViewClick(textView1));
        textView2.setOnClickListener(v -> handleTextViewClick(textView2));
        textView3.setOnClickListener(v -> handleTextViewClick(textView3));
        textView4.setOnClickListener(v -> handleTextViewClick(textView4));
        textView5.setOnClickListener(v -> handleTextViewClick(textView5));
        textView6.setOnClickListener(v -> handleTextViewClick(textView6));
        textView7.setOnClickListener(v -> handleTextViewClick(textView7));
        textView8.setOnClickListener(v -> handleTextViewClick(textView8));
        textView9.setOnClickListener(v -> handleTextViewClick(textView9));
        textView10.setOnClickListener(v -> handleTextViewClick(textView10));
        textView11.setOnClickListener(v -> handleTextViewClick(textView11));




        return view;
    }
    private void handleTextViewClick(TextView textView) {

        float[] midPoint1, midPoint2, endPoint;

        if (lastClickedTextView != null && lastClickedTextView == textView) {
            carImageView.clearMarker();
            carImageView.clearPaths();
            lastClickedTextView = null;
            return;
        }

        if (textView.getId() == R.id.car4f_1) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{700, 450};
            endPoint = new float[]{700, 300};
        } else if (textView.getId() == R.id.car4f_2) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{850, 450};
            endPoint = new float[]{850, 300};
        } else if (textView.getId() == R.id.car4f_3) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_4) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_5) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_6) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_7) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_8) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_9) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_10) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        }else if (textView.getId() == R.id.car4f_11) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{350, 450};
            endPoint = new float[]{800, 450};
        } else {
            return;
        }

        carImageView.clearPaths();

        for (float[] startCoordinate : startCoordinates) {
            float[] intermediatePointsX = {midPoint1[0], midPoint2[0]};
            float[] intermediatePointsY = {midPoint1[1], midPoint2[1]};

            drawRoute(startCoordinate[0], startCoordinate[1], intermediatePointsX, intermediatePointsY, endPoint[0], endPoint[1]);
        }

        carImageView.clearMarker();
        carImageView.addMarker(endPoint[0], endPoint[1]);
        lastClickedTextView = textView;

    }
    private void drawRoute(float startX, float startY, float[] intermediatePointsX, float[] intermediatePointsY, float destinationX, float destinationY) {
        carImageView.addPolyline(startX, startY, intermediatePointsX, intermediatePointsY, destinationX, destinationY, Color.RED);
    }
}