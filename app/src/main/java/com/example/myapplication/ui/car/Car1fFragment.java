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


public class Car1fFragment extends Fragment {

    private CarImageView carImageView;
    private TextView lastClickedTextView;

    private final float[] startCoordinates = {200, 550};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car1f, container, false);

        carImageView = view.findViewById(R.id.carimage_1f);

        TextView textView1 = view.findViewById(R.id.car1f_1);
        TextView textView2 = view.findViewById(R.id.car1f_2);
        TextView textView3 = view.findViewById(R.id.car1f_3);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleTextViewClick(textView1);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleTextViewClick(textView2);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleTextViewClick(textView3);
            }
        });


        return view;
    }
    private void handleTextViewClick(TextView textView) {

        float[] midPoint, endPoint;

        if (lastClickedTextView != null && lastClickedTextView == textView) {
            carImageView.clearMarker();
            lastClickedTextView = null;
            return;
        }

        if (textView.getId() == R.id.car1f_1) {
            midPoint = new float[]{200, 425};
            endPoint = new float[]{500, 425};
        } else if (textView.getId() == R.id.car1f_2) {
            midPoint = new float[]{200, 450};
            endPoint = new float[]{120, 450};
        } else if (textView.getId() == R.id.car1f_3) {
            midPoint = new float[]{200, 300};
            endPoint = new float[]{800, 300};
        } else {
            return;
        }

        float[] intermediatePointsX = {midPoint[0]};
        float[] intermediatePointsY = {midPoint[1]};

        drawRoute(startCoordinates[0], startCoordinates[1], intermediatePointsX, intermediatePointsY, endPoint[0], endPoint[1]);
        carImageView.addMarker(endPoint[0], endPoint[1]);
        lastClickedTextView = textView;

    }
    private void drawRoute(float startX, float startY, float[] intermediatePointsX, float[] intermediatePointsY, float destinationX, float destinationY) {
        carImageView.addPolyline(startX, startY, intermediatePointsX, intermediatePointsY, destinationX, destinationY, Color.RED);
    }
}
