package com.example.myapplication.ui.car;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

import java.util.ArrayList;
import java.util.List;

public class CarImageView extends AppCompatImageView {

    private Paint markerPaint;
    private Paint pathPaint;
    private List<float[]> markers;
    private List<Path> paths;
    private Path path;

    private boolean drawPath;
    private boolean drawPaths = false;
    public CarImageView(@NonNull Context context) {
        super(context);
        init();
    }

    public CarImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CarImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        markerPaint = new Paint();
        markerPaint.setColor(Color.RED);
        markerPaint.setStrokeWidth(10);
        markerPaint.setStyle(Paint.Style.FILL);

        pathPaint = new Paint();
        pathPaint.setColor(Color.RED);
        pathPaint.setStrokeWidth(5);
        pathPaint.setStyle(Paint.Style.STROKE);

        markers = new ArrayList<>();
        paths = new ArrayList<>();
        drawPath = false;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!markers.isEmpty()) {
            for (float[] marker : markers) {
                canvas.drawCircle(marker[0], marker[1], 20, markerPaint);
            }
        }
        for (Path path : paths) {
            canvas.drawPath(path, pathPaint);
        }
    }

    public void addMarker(float x, float y) {
        markers.clear(); // Remove previous markers
        markers.add(new float[]{x, y});
        invalidate();
    }


    public void clearMarker() {
        markers.clear();
        invalidate();
    }
    public void clearPaths() {
        paths.clear();
        invalidate();
    }

    public void addPolyline(float startX, float startY, float[] intermediatePointsX, float[] intermediatePointsY, float destinationX, float destinationY, int color) {
        pathPaint.setColor(color);
        Path path = new Path();
        path.moveTo(startX, startY);
        for (int i = 0; i < intermediatePointsX.length; i++) {
            path.lineTo(intermediatePointsX[i], intermediatePointsY[i]);
        }
        path.lineTo(destinationX, destinationY);
        paths.add(path);
        drawPaths = true;
        invalidate();
    }
}
