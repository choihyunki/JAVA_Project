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

public class Car3fFragment extends Fragment {

    private CarImageView carImageView;
    private TextView lastClickedTextView;

    private final float[][] startCoordinates = {
            {350, 560},
            {120, 450}
    };


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car3f, container, false);

        carImageView = view.findViewById(R.id.carimage_3f);

        TextView textView1 = view.findViewById(R.id.car3f_1);
        TextView textView2 = view.findViewById(R.id.car3f_2);
        TextView textView3 = view.findViewById(R.id.car3f_3);

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

        float[] midPoint1, midPoint2, endPoint;

        if (lastClickedTextView != null && lastClickedTextView == textView) {
            carImageView.clearMarker();
            carImageView.clearPaths();
            lastClickedTextView = null;
            return;
        }

        if (textView.getId() == R.id.car3f_1) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{700, 450};
            endPoint = new float[]{700, 300};
        } else if (textView.getId() == R.id.car3f_2) {
            midPoint1 = new float[]{350, 450};
            midPoint2 = new float[]{850, 450};
            endPoint = new float[]{850, 300};
        } else if (textView.getId() == R.id.car3f_3) {
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
